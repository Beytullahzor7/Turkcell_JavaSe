package com.uml;

public class Student extends Person implements ISchool {
	
	private String dersler;
	
	public void derslerMetodu() {
		
	}
	
	public String derslerMetodu(String adi) {
		return adi;
	}
	
	// FROM INTERFACE
	@Override
	public void create() {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public void delete() {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public void select() {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public void update() {
		// TODO Auto-generated method stub
		
	}
	
}
