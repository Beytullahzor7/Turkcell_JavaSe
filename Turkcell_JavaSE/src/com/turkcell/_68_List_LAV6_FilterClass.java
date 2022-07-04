package com.turkcell;

public class _68_List_LAV6_FilterClass {
	
	private long id;
	private String nameAndSurname;
	private int price;
	
	public _68_List_LAV6_FilterClass() {
		this.id = 0;
		this.nameAndSurname = "adi ve soyadi girmediniz";
		this.price = 0;
	}
	
	public _68_List_LAV6_FilterClass(long id, String nameAndSurname, int price) {
		super();
		this.id = id;
		this.nameAndSurname = nameAndSurname;
		this.price = price;
	}
	
	public long getId() {
		return id;
	}
	
	public void setId(long id) {
		this.id = id;
	}
	
	public String getNameAndSurname() {
		return nameAndSurname;
	}
	
	public void setNameAndSurname(String nameAndSurname) {
		this.nameAndSurname = nameAndSurname;
	}
	
	public int getPrice() {
		return price;
	}
	
	public void setPrice(int price) {
		this.price = price;
	}
	
	@Override
	public String toString() {
		return "_68_List_LAV6_FilterClass [id=" + id + ", nameAndSurname=" + nameAndSurname + ", price=" + price + "]";
	}
	
}
