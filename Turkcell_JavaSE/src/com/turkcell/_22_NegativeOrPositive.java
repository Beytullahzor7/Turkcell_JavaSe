package com.turkcell;

import java.util.Scanner;

public class _22_NegativeOrPositive {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Input a Number: ");
		int number = input.nextInt();
		
		String negativeOrPositive = (number > 0) ? "Positive" : "Negative";
		System.out.println(negativeOrPositive);
		
	}
	
}
