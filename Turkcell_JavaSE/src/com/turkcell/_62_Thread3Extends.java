package com.turkcell;

public class _62_Thread3Extends extends Thread {
	
	private String className;
	
	public String getClassName() {
		return className;
	}
	
	public void setClassName(String className) {
		this.className = className;
	}
	
	// Parametreli Constructor
	public _62_Thread3Extends(String className) {
		this.className = className;
	}
	
	// Run method
	@Override
	public void run() {
		for (int i = 1; i <= 10; i++) {
			try {
				// 1000ms = 1ms uyu
				Thread.sleep(1000);
				
				System.out.println(this.className + " " + i);
				
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
