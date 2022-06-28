package com.turkcell;

public class _44_EnumMainTest2 {
	
	public static void main(String[] args) {
		_43_EnumConstructor enumConstructor = _43_EnumConstructor.BUYUK;
		System.out.println(enumConstructor);
		System.out.println("SIRA: " + enumConstructor.ordinal());
		System.out.println("KEY: " + enumConstructor.getKey());
		System.out.println("VALUE: " + enumConstructor.getValue());
		
		String str = _43_EnumConstructor.BUYUK.toString();
		System.out.println(str);
		
		String str2 = _43_EnumConstructor.BUYUK.getValue().toString();
		System.out.println(str2);
		
		System.out.println("***************************");
		for (_43_EnumConstructor temp : _43_EnumConstructor.values()) {
			System.out.println(temp + " " + temp.getKey() + " " + temp.getValue());
		}
		
	}
	
}
