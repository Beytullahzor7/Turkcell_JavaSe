package com.turkcell;

import java.util.Date;
import java.util.Scanner;

public class _21_SwitchCaseWhichDay {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Your input is : ");
		String day = input.nextLine();
		
		switch (day.toLowerCase()) {
			case "sunday":
				System.out.println("Today is Sunday");
				break;
			case "monday":
				System.out.println("Today is Monday");
				break;
			case "tuesday":
				System.out.println("Today is Tuesday");
				break;
			case "wednesday":
				System.out.println("Today is Wednesday");
				break;
			case "thursday":
				System.out.println("Today is Thursday");
				break;
			case "friday":
				System.out.println("Today is Friday");
				break;
			case "saturday":
				System.out.println("Today is Saturday");
				break;
			default:
				System.out.println(new Date(System.currentTimeMillis()));
				break;
		}
	}
}
