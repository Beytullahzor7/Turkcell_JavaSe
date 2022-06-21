package com.turkcell;

import java.util.Scanner;

public class _09_Scanner {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Please input a word: ");
		String kelime = input.nextLine();
		System.out.println(kelime.charAt(0));
		
		for (int i = 0; i < kelime.length(); i++) {
			System.out.println(kelime.charAt(i));
		}
		
	}
	
}
