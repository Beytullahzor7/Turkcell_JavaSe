package com.turkcell;

import java.util.Scanner;

public class _23_VizeFinal {
	
	public static void main(String[] args) {
		// Kullanicidan alinan vize final notuna gore gecme
		// not ortalamasi: 50 gecti
		// not ortalamasi: 55<= x <=70 bb
		// not ortalamasi: 70< x <=84 ba
		// not ortalamasi: 84< x <=100 aa
		
		calculateNote();
	}
	
	public static void calculateNote() {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Please input your firstNote: ");
		int firstNote = input.nextInt();
		
		System.out.print("Please input your secondNote: ");
		int secondNote = input.nextInt();
		
		input.close();
		
		double average = (firstNote + secondNote) / 2;
		
		if (average < 50) {
			System.out.println("Failed...");
		} else {
			if ((50 <= average) && (average <= 70)) {
				System.out.println("BB");
			} else if ((70 < average) && (average <= 84)) {
				System.out.println("BA");
			} else {
				System.out.println("AA");
			}
		}
	}
}
