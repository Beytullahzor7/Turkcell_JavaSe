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
			System.out.println("Say� d���ndad�r");
		
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
				System.out.println("Say� d���ndad�r");
				break;
		}
		
		// if else
		int number2 = 15;
		if (number2 > 10) {
			System.out.println("karar");
			System.out.println("B�y�kt�r");
		} else {
			System.out.println("K���kt�r");
		}
		
		System.out.println("***********************************");
		// Ternary
		String result = (number1 > 10) ? "B�y�kt�r" : "K���kt�r";
		System.out.println(result);
		
	}
	
}
