package com.turkcell;

import java.util.Scanner;

public class _11_Math {
	
	public static void main(String[] args) {
		// Hipotenus
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("1. Kenar: ");
		int firstInput = input.nextInt();
		
		System.out.print("2. Kenar: ");
		int SecondInput = input.nextInt();
		
		System.out.println("Result is: " + Math.sqrt(Math.pow(firstInput, 2) + Math.pow(SecondInput, 2)));
		
	}
	
}
