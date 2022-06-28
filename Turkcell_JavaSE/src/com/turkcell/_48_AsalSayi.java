package com.turkcell;

public class _48_AsalSayi {
	
	public static void main(String[] args) {
		System.out.println(isNumberPrime(57));
	}
	
	public static boolean isNumberPrime(int number) {
		if (number < 2) {
			return false;
		}
		
		for (int i = 2; i < number; i++) {
			if (number % i == 0) {
				return false;
			}
		}
		return true;
	}
}
