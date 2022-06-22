package com.turkcell;

import java.util.Scanner;

public class _18_StringExamples {
	
	public static void main(String[] args) {
		// Kullanýcýdan alýnan 2 sayýnýn dort islemi
		
		/*
		 * Scanner input = new Scanner(System.in);
		 * // 1. Soru
		 * System.out.print("Please input first number: ");
		 * int number1 = input.nextInt();
		 * System.out.print("Please input second number: ");
		 * int number2 = input.nextInt();
		 * System.out.println("Toplam: " + (number1 + number2));
		 * System.out.println("Cikarma: " + (number1 - number2));
		 * System.out.println("Carpma: " + (number1 * number2));
		 * System.out.println("Bolme: " + (number1 / number2));
		 * System.out.println("Kalan: " + (number1 % number2));
		 * System.out.println(Math.sqrt(Math.max(number1, number2)));
		 * System.out.println(Math.abs(Math.min(number1, number2)));
		 * System.out.println(Math.pow(Math.min(number1, number2), Math.max(number1,
		 * number2)));
		 * input.close();
		 */
		
		// compareTwoInput();
		// compareTwoInput2();
		
		userInput();
		
	}
	
	// 2. Soru (password-repassword)
	public static void compareTwoInput() {
		Scanner input2 = new Scanner(System.in);
		
		System.out.print("Input Your Password: ");
		String password = input2.nextLine();
		
		System.out.print("Input Your Password Again: ");
		String rePassword = input2.nextLine();
		
		if (password.equals(rePassword)) {
			System.out.println("Login Success");
		} else {
			System.out.println("Try Again...");
		}
	}
	
	public static void compareTwoInput2() {
		Scanner input2 = new Scanner(System.in);
		
		System.out.print("Input Your Password: ");
		String password = input2.nextLine();
		
		System.out.print("Input Your Password Again: ");
		String rePassword = input2.nextLine();
		
		String result = password.equals(rePassword) ? "Login Success" : "Try Again";
		System.out.println(result);
	}
	
	// 3. Soru (Klavyeden girilen bir input sayi mi, harf mi, yoksa ozel karakter
	// mi?
	// Character.isJavaLetter(), Character.isDigit())
	
	public static void userInput() {
		char c1 = '4';
		
		if (Character.isDigit(c1)) {
			System.out.println("Sayidir");
		} else if (Character.isLetter(c1)) {
			System.out.println("Harftir");
		} else {
			System.out.println("Ozel Simge");
		}
	}
}
