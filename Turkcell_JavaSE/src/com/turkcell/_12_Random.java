package com.turkcell;

import java.util.Random;

public class _12_Random {
	
	public static void main(String[] args) {
		// Random
		double mathRandom = Math.round(Math.random() * 4 + 1);
		System.out.println(mathRandom);
		
		// Class duzeyinde (Object)
		Random random = new Random();
		int randomClass = random.nextInt(4) + 1;
		System.out.println(randomClass);
	}
	
}
