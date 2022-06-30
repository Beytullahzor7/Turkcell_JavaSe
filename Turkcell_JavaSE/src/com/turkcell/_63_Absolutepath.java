package com.turkcell;

import java.io.File;
import java.io.IOException;

public class _63_Absolutepath {
	
	public static void main(String[] args) throws IOException {
		File file = new File("test.txt");
		printPaths(file);
		
	}
	
	private static void printPaths(File file) throws IOException {
		System.out.println("Absolute Path: " + file.getAbsolutePath());
	}
}
