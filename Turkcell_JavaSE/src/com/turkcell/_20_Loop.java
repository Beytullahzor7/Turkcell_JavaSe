package com.turkcell;

public class _20_Loop {
	
	public static void main(String[] args) {
		
		// for
		for (int i = 0; i <= 10; i++) {
			System.out.println(i);
		}
		
		System.out.println("***********************");
		
		// while
		int x = 1;
		while (x <= 10) {
			System.out.println(x);
			x++;
		}
		
		System.out.println("***********************");
		// do-while --> Sart saglanmasa bile en az 1 kere calisir
		int y = 1;
		
		do {
			System.out.println(y);
			y++;
			
		} while (y < 5);
	}
}
