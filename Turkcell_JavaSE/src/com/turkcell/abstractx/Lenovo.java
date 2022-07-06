package com.turkcell.abstractx;

public class Lenovo extends Computer {
	
	private String modal;
	
	public Lenovo() {
		
	}
	
	public Lenovo(String cpu, String ram, String smartMainBoard, String port, String modal) {
		super(cpu, ram, smartMainBoard, port);
		this.modal = modal;
	}
	
	public String getModal() {
		return modal;
	}
	
	public void setModal(String modal) {
		this.modal = modal;
	}
	
	@Override
	public void govdesizMethod(String name) {
		System.out.println("Govdesiz Method: " + name);
		
	}
	
	@Override
	public String toString() {
		return "Lenovo [modal=" + modal + "]";
	}
	
}
