package com.turkcell.inheritance;

public class Computer {
	
	private String cpu;
	private String ram;
	private String smartMainBoard;
	private String port;
	
	public Computer() {
		
	}
	
	public Computer(String cpu, String ram, String smartMainBoard, String port) {
		this.cpu = cpu;
		this.ram = ram;
		this.smartMainBoard = smartMainBoard;
		this.port = port;
	}
	
	public void commonMethod() {
		System.out.println("Computer Method: ");
	}
	
	@Override
	public String toString() {
		return "Computer [cpu=" + cpu + ", ram=" + ram + ", smartMainBoard=" + smartMainBoard + ", port=" + port + "]";
	}
	
	public String getCpu() {
		return cpu;
	}
	
	public void setCpu(String cpu) {
		this.cpu = cpu;
	}
	
	public String getRam() {
		return ram;
	}
	
	public void setRam(String ram) {
		this.ram = ram;
	}
	
	public String getSmartMainBoard() {
		return smartMainBoard;
	}
	
	public void setSmartMainBoard(String smartMainBoard) {
		this.smartMainBoard = smartMainBoard;
	}
	
	public String getPort() {
		return port;
	}
	
	public void setPort(String port) {
		this.port = port;
	}
	
}
