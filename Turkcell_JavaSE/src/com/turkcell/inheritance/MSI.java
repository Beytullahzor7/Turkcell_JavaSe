package com.turkcell.inheritance;

public class MSI extends Computer {
	
	public MSI() {
		
	}
	
	public MSI(String cpu, String ram, String smartMainBoard, String port) {
		super(cpu, ram, smartMainBoard, port);
		
	}
	
	@Override
	public void commonMethod() {
		System.out.println("MSI Common Method");
	}
	
	@Override
	public String toString() {
		return "Msi [getCpu()=" + getCpu() + ", getRam()=" + getRam() + ", getSmartMainBoard()=" + getSmartMainBoard()
				+ "]";
	}
	
}
