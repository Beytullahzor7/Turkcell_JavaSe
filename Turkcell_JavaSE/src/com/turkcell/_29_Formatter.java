package com.turkcell;

public class _29_Formatter {
	
	public static void main(String[] args) {
		String str = "Java Verileri";
		int decimal = 44;
		double virgul = 35.55;
		
		// System.out.print("Alt satira gecme");
		
		// System.out.println("Alt satira gecebilirsin");
		
		System.out.printf("%s %d %f", str, decimal, virgul);
		
		// 25s=sağa ötelemek
		// 5.2f = .2 virgülden sonra 2 hane getir
		System.out.printf("%25s %d %5.2f", str, decimal, virgul);
		System.out.println();
	}
	
}
