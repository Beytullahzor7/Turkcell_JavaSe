package com.turkcell;

import java.io.File;

public class _64_FileIO3 {
	
	public static void main(String[] args) {
		
		File file = new File(_64_FileIO.MY_PATH);
		boolean data = file.canExecute();
		if (data) {
			System.out.println("�al��ma izni verilmi�tir");
		} else {
			System.out.println("�al��ma izni verilmemi�tir !!!!");
		}
		
		data = file.setExecutable(false);
		
		if (data) {
			System.out.println("�al��ma izni verilmi�tir");
		} else {
			System.out.println("�al��ma izni verilmemi�tir !!!!");
		}
	}
}
