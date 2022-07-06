package com.turkcell.inheritance;

public class Monster extends Computer {
	
	private int price;
	
	public Monster() {
		
	}
	
	public Monster(String cpu, String ram, String smartMainBoard, String port, int price) {
		super(cpu, ram, smartMainBoard, port);
		this.price = price;
	}
	
	@Override
	public void commonMethod() {
		System.out.println("Monster Common Method");
	}
	
	@Override
	public String toString() {
		return "Monster [price=" + price + "]";
	}
	
	public int getPrice() {
		return price;
	}
	
	public void setPrice(int price) {
		this.price = price;
	}
	
}
