package com.turkcell;

public class _24_AsalSayi {
	
	public static void main(String[] args) {
		System.out.println(isAsal(11));
	}
	
	public static boolean isAsal(int number) {
		if (number < 2)
			return false;
		
		for (int i = 2; i < number; i++) {
			if ((number % i) == 0) {
				return false;
			}
		}
		return true;
	}
}
