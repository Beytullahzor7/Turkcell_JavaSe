package com.turkcell;

import java.io.File;

public class _64_FileIO3 {
	
	public static void main(String[] args) {
		
		File file = new File(_64_FileIO.MY_PATH);
		boolean data = file.canExecute();
		if (data) {
			System.out.println("Çalışma izni verilmiştir");
		} else {
			System.out.println("Çalışma izni verilmemiştir !!!!");
		}
		
		data = file.setExecutable(false);
		
		if (data) {
			System.out.println("Çalışma izni verilmiştir");
		} else {
			System.out.println("Çalışma izni verilmemiştir !!!!");
		}
	}
}
