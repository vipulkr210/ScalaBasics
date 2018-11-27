package com.vipul.java;
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;

class FileReader {
	public static void main(String args[]) throws IOException {
		
		File file = new File("D://ScalaWorkspace/TrainingSession/ScalaPractice/src/com/vipul/java/FileReader.java"); 
  
		BufferedReader br = new BufferedReader(new java.io.FileReader(file)); 
		String st; 
		while ((st = br.readLine()) != null) 
			System.out.println(st); 
	}
}