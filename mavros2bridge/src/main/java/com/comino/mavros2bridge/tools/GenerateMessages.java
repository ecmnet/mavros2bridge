package com.comino.mavros2bridge.tools;

import java.io.File;
import java.io.IOException;
import java.nio.file.Path;
import java.util.ArrayList;

import us.ihmc.idl.generator.IDLGenerator;
import us.ihmc.idl.generator.IDLGeneratorTask;
import us.ihmc.rosidl.ROS2MsgToIdlGenerator;


public class GenerateMessages {
	
	private final String pathToPackage = "/Users/ecmnet/PixHawk/java/mavros2bridge/mavros2bridge/px4_msgs";
	private final String pathToIDL     = "/Users/ecmnet/PixHawk/java/mavros2bridge/mavros2bridge/tmp";
	private final String pathToTarget  = "/Users/ecmnet/PixHawk/java/mavros2bridge/mavros2bridge/src/main/java";
	
	private void run( ) {
		
		ROS2MsgToIdlGenerator toIDL = new ROS2MsgToIdlGenerator( );
		try {
			toIDL.addPackageRoot(Path.of(pathToPackage), null);
			toIDL.convertToIDL(Path.of(pathToIDL));
		} catch (IOException e) {
			e.printStackTrace();
			return;
		}
		
		ArrayList<File> defaultIncludePath = new ArrayList<>();
	      defaultIncludePath.add(new File("."));
		
		File fileIDL = new File(pathToIDL+"/px4_msgs/msg");
		File[] files = fileIDL.listFiles();
		
		for(File idl : files) {
			 try {
				IDLGenerator.execute(idl, "", new File(pathToTarget), defaultIncludePath, "");
			} catch (IOException e) {
				System.err.println(idl.getName()+" could not be created. Skipped");
			}
		}
		
		
	}

	public static void main(String[] args) {
		GenerateMessages gen = new GenerateMessages( );
		gen.run( );
	}

}
