/****************************************************************************
 *
 *   Copyright (c) 2021 Eike Mansfeld ecm@gmx.de. All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions
 * are met:
 *
 * 1. Redistributions of source code must retain the above copyright
 *    notice, this list of conditions and the following disclaimer.
 * 2. Redistributions in binary form must reproduce the above copyright
 *    notice, this list of conditions and the following disclaimer in
 *    the documentation and/or other materials provided with the
 *    distribution.
 * 3. Neither the name of the copyright holder nor the names of its
 *    contributors may be used to endorse or promote products derived
 *    from this software without specific prior written permission.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS
 * "AS IS" AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT
 * LIMITED TO, THE IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS
 * FOR A PARTICULAR PURPOSE ARE DISCLAIMED. IN NO EVENT SHALL THE
 * COPYRIGHT OWNER OR CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT,
 * INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING,
 * BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS
 * OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED
 * AND ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT
 * LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN
 * ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE
 * POSSIBILITY OF SUCH DAMAGE.
 *
 ****************************************************************************/

package com.comino.mavros2bridge.tools;

import java.awt.Graphics;
import java.awt.Point;
import java.awt.image.BufferedImage;
import java.awt.image.DataBufferByte;
import java.awt.image.Raster;
import java.io.IOException;

import com.comino.mavros2bridge.types.ImagePubSubType;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.embed.swing.SwingFXUtils;
import javafx.scene.Scene;
import javafx.scene.image.ImageView;
import javafx.scene.image.WritableImage;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;
import us.ihmc.pubsub.DomainFactory.PubSubImplementation;
import us.ihmc.pubsub.common.SampleInfo;
import us.ihmc.pubsub.common.Time;
import us.ihmc.ros2.ROS2Distro;
import us.ihmc.ros2.ROS2Node;

public class JavaROS2ImageViewer extends Application  {
	
	private static final String imageTopic = "/image_raw";

	private static final int WIDTH = 640;
	private static final int HEIGHT = 480;

	private BufferedImage output;
	private final ImageView ivrgb = new ImageView();
	private WritableImage wirgb;
	
	private float fps;
	private long  nanos_old;
	private long  nanos;
	
	public static final long NANOSECONDS_PER_SECOND = 1000000000;
	
	@Override
	public void start(Stage primaryStage) throws IOException {
		primaryStage.setTitle("ROS2 Image viewer");

		FlowPane root = new FlowPane();

		root.getChildren().add(ivrgb);

		primaryStage.setScene(new Scene(root, WIDTH,HEIGHT));
		primaryStage.show();

		output = new BufferedImage(WIDTH, HEIGHT, BufferedImage.TYPE_3BYTE_BGR);
		wirgb = new WritableImage(WIDTH, HEIGHT);
		ivrgb.setImage(wirgb);
		
		SampleInfo info = new SampleInfo();
		Graphics c = output.getGraphics();

		
		ROS2Node node = new ROS2Node(PubSubImplementation.FAST_RTPS, 
				ROS2Distro.fromEnvironment(), "JavaImageReceiver", "/ecm", 0);
		
		
		node.createSubscription(new ImagePubSubType(WIDTH*HEIGHT*3), subscriber -> {
			sensor_msgs.msg.dds.Image message = new sensor_msgs.msg.dds.Image();
			
			if (subscriber.takeNextData(message, info)) {
				output.setData(Raster.createRaster(output.getSampleModel(), 
						new DataBufferByte(message.data_.toArray(),0), new Point() ) );
				
				nanos = getNanos(message.getHeader().getStamp());
				if(nanos_old>0)
				  fps = ((float)NANOSECONDS_PER_SECOND) /( nanos - nanos_old );
				nanos_old = nanos;
				
				c.drawString(message.getHeader().getStamp().toString(), 5, 20);
				c.drawString(String.format("%3.1f fps", fps), WIDTH-60, 20);
				Platform.runLater(() -> {
					SwingFXUtils.toFXImage(output, wirgb);
				});
			}
		}, imageTopic);

		

	}

	@Override
	public void stop() throws Exception {
		
		super.stop();
	}


	public static void main(String[] args) {


		launch(args);
	}
	
	private long getNanos(builtin_interfaces.msg.dds.Time time ) {
		return time.sec_ * NANOSECONDS_PER_SECOND + time.nanosec_;
	}

}
