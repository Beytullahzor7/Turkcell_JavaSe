package com.examples;

import java.util.Scanner;

public class _01_Bilinmeyenli_Denklem {
	
	public static void main(String[] args) {
		
		// 1. Soru
		// 1. dereceden 2 bilinmeyenli denklem
		// y=3x+4k
		
		Scanner input = new Scanner(System.in);
		
		/*
		 * System.out.print("Input first number: ");
		 * int x = input.nextInt();
		 * System.out.print("Input second number: ");
		 * int k = input.nextInt();
		 * int y = 3 * x + 4 * k;
		 * System.out.println("Result of y=3x+4k is: " + y);
		 */
		
		// 2. soru
		// Dereceyi fahrenhayta cevir
		// (derece*9/5)+32
		
		/*
		 * System.out.print("Input a degree: ");
		 * int derece = input.nextInt();
		 * int decereToFahrenheit = (derece * 9 / 5) + 32;
		 * System.out.printf("%d derece is equal to %d fahrenheit", derece,
		 * decereToFahrenheit);
		 */
		
		int x1 = 4, x2 = 2;
		// bolme, cikarma,carpma,toplama, bolumunden kalan
		
		int bolme = x1 / x2;
		int cikarma = x1 - x2;
		int carpma = x1 * x2;
		int toplama = x1 + x2;
		int kalan = x1 % x2;
		
		System.out.println(bolme + "," + cikarma + "," + carpma + "," + toplama + "," + kalan);
		
	}
	
}
