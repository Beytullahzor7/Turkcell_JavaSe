package com.turkcell;

import java.io.File;
import java.io.IOException;

public class _64_FileCreateExample {
	public static void main(String[] args) {
		
		try {
			
			File myObj = new File("filename.txt");
			
			if (myObj.createNewFile()) {
				System.out.println("File created: " + myObj.getName());
				System.out.println(myObj.getPath());
			} else {
				System.out.println("File already exists.");
				System.out.println(myObj.getPath());
				System.out.println(myObj.getAbsolutePath());
			}
		} catch (IOException e) {
			System.out.println("An error occurred.");
			e.printStackTrace();
		}
	}
	
}
