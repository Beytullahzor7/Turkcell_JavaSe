package com.turkcell;

import java.util.Scanner;

public class _32_StringReverse {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Please input your text : ");
		String userInput = input.nextLine();
		
		// System.out.println("Reversed String: " + getReverse(userInput));
		System.out.println("Reversed String: " + getReverse2(userInput));
		
	}
	
	public static String getReverse(String input) {
		StringBuilder builder = new StringBuilder();
		
		String reverse = builder.append(input).reverse().toString();
		return reverse;
	}
	
	public static String getReverse2(String input) {
		String reversedWord = "";
		
		for (int i = input.length() - 1; i >= 0; i--) {
			reversedWord += input.charAt(i);
		}
		return reversedWord;
	}
}
