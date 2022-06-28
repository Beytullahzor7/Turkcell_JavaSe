package com.turkcell;

public enum _43_EnumConstructor {
	KUCUK(1, "kucuk"), ORTA(2, "orta"), BUYUK(3, "buyuk");
	
	private final int key;
	private final String value;
	
	// parametreli constructor
	private _43_EnumConstructor(int key, String value) {
		this.key = key;
		this.value = value;
	}
	
	// getter
	public int getKey() {
		return key;
	}
	
	public String getValue() {
		return value;
	}
	
}
