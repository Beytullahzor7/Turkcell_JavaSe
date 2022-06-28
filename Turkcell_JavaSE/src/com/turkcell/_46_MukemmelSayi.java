package com.turkcell;

import java.util.Scanner;

public class _46_MukemmelSayi {
	// Matematikte bazı pozitif tam sayıların pozitif bölenleri toplamı,
	// sayının kendisinin iki katına eşittir. Bu tür sayılara “mükemmel sayı” denir.
	
	public static void main(String[] args) {
		userInput();
	}
	
	public static void userInput() {
		Scanner input = new Scanner(System.in);
		System.out.print("Please input a positive number : ");
		
		int number = input.nextInt();
		
		if (number <= 0) {
			System.out.println("Wrong Input...");
			userInput();
			
		} else {
			System.out.println(isNumberPerfect(number));
		}
	}
	
	public static boolean isNumberPerfect(int number) { // 6 = 1,2,3,6
		int sumOfPositiveDivisors = 0;
		
		for (int i = 1; i <= number; i++) {
			if (number % i == 0) {
				sumOfPositiveDivisors += i;
			}
		}
		
		boolean isPerfect = (sumOfPositiveDivisors == number * 2) ? true : false;
		return isPerfect;
	}
}
