package com.turkcell;

public class _19_IfElseTernary {
	
	public static void main(String[] args) {
		
		// if elseif else
		int number1 = 122;
		if (number1 == 10)
			System.out.println("10");
		else if (number1 == 11)
			System.out.println("11");
		else if (number1 == 12)
			System.out.println("12");
		else if (number1 == 13)
			System.out.println("13");
		else if (number1 == 14)
			System.out.println("14");
		else if (number1 == 15)
			System.out.println("15");
		else
			System.out.println("Sayý dýþýndadýr");
		
		System.out.println("***********************************");
		
		switch (number1) {
			case 10:
				System.out.println("10");
				break;
			case 11:
				System.out.println("11");
				break;
			case 12:
				System.out.println("12");
				break;
			case 13:
				System.out.println("13");
				break;
			case 14:
				System.out.println("14");
				break;
			case 15:
				System.out.println("15");
				break;
			
			default:
				System.out.println("Sayý dýþýndadýr");
				break;
		}
		
		// if else
		int number2 = 15;
		if (number2 > 10) {
			System.out.println("karar");
			System.out.println("Büyüktür");
		} else {
			System.out.println("Küçüktür");
		}
		
		System.out.println("***********************************");
		// Ternary
		String result = (number1 > 10) ? "Büyüktür" : "Küçüktür";
		System.out.println(result);
		
	}
	
}
