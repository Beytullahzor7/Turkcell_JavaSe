package com.turkcell;

public class _21_RandomNumber {
	
	public static void main(String[] args) {
		// 1-10 arasinda 5 tane random sayi iretelim (random-for)
		
		double sum = 0;
		
		for (int i = 0; i < 5; i++) {
			double number = Math.random() * 10;
			System.out.println(i + ". number " + number);
			sum += number;
		}
		System.out.println("Sum : " + sum);
	}
}
