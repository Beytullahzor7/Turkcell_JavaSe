package com.examples;

import java.util.Scanner;

public class _02_Matris {
	
	public static void main(String[] args) {
		createMatris();
		
	}
	
	public static void createMatris() {
		Scanner scanner = new Scanner(System.in);
		
		int num1 = scanner.nextInt();
		int num2 = scanner.nextInt();
		scanner.nextLine();
		
		String[][] matris = new String[num1][num2];
		
		for (int i = 0; i < num1; i++) {
			for (int j = 0; j < num2; j++) {
				if (i == j) {
					matris[i][j] = "*";
				} else {
					matris[i][j] = scanner.next();
				}
			}
		}
		
		for (int i = 0; i < num1; i++) {
			for (int j = 0; j < num2; j++) {
				System.out.print(matris[i][j] + " ");
			}
			System.out.println();
		}
	}
}
