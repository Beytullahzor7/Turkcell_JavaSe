package com.turkcell;

public class _25_Factorial {
	
	public static void main(String[] args) {
		System.out.println(factorial(5));
		factorial2(5);
	}
	
	public static int factorial(int number) {
		if (number < 2)
			return 1;
		
		return number * factorial(number - 1);
	}
	
	public static void factorial2(int num) {
		int result = 1;
		for (int i = num; i > 0; i--) {
			result *= i;
		}
		System.out.println("Result : " + result);
	}
}
