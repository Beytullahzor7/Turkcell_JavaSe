package com.turkcell;

public class _05_VariableDefinitionRules {
	
	public static void main(String[] args) {
		// _05_VariableDefinitionRules
		int valueName; // camelCase
		
		int value44; // değişken sayı ile birebilir
		int _value44; // değişken underscore (alt çizgi)ile başlayabilir
		int $value44; // değişken sayı $ birebilir.
		
		// int -value44; //Özel Simge ile başlanmaz (_ ve $ hariç)
		
		// Java 10 gelen ozellikler
		// var
		
		var sayi = 55;
		System.out.println(sayi);
		
	}
	
}
