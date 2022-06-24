package com.turkcell;

public class _36_GuessNumber {
	
	public static void main(String[] args) {
		int number = (int) (Math.random() * 100);
		System.out.println("Number is: " + number);
		
		System.out.println(guessNumber(number));
		
	}
	
	public static int guessNumber(int number) {
		int result = (((number * 2) + 22) / 2) - number;
		return result;
	}
}
