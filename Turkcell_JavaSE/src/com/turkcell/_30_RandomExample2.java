package com.turkcell;

public class _30_RandomExample2 {
	
	public static void main(String[] args) {
		// 1-10 arasinda 5 random sayi uretelim ve bunlari toplayalim
		// ancak bu sayilardan 5 e bolunenleri almayalim
		
		int sum = 0;
		
		for (int i = 0; i < 5; i++) {
			int number = (int) (Math.random() * 10);
			System.out.println(i + ". number " + number);
			if (number % 5 == 0) {
				continue;
			}
			sum += number;
		}
		System.out.println("Sum : " + sum);
		
	}
	
}
