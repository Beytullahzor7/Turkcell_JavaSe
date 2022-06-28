package com.turkcell;

// enum class interface
// Java 5 gelen özelliktir.
// type safe sağlar
// enum class interface
// new oluşturulmaz ==> enum, interface , abstract
// enum saymaya sıfırdan başlar

public class _42_EnumMainTest {
	
	public static void main(String[] args) {
		System.out.println(_41_Enum.CARSAMBA);
		
		_41_Enum enum1 = _41_Enum.CARSAMBA;
		System.out.println(enum1);
		System.out.println("Sira: " + enum1.ordinal());
		System.out.println("Values: " + _41_Enum.values()[2]);
		
		String str = _41_Enum.CUMARTESI.toString();
		System.out.println(str);
		
		for (_41_Enum temp : _41_Enum.values()) {
			System.out.println(temp + " ");
		}
	}
	
}
