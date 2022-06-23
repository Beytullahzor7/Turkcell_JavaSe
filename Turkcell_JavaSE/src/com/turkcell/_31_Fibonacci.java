package com.turkcell;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class _31_Fibonacci {
	
	public static void main(String[] args) {
		// 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Input a step : ");
		int step = input.nextInt();
		
		System.out.println(fibonacci(step));
		
	}
	
	public static List<Integer> fibonacci(int number) {
		ArrayList<Integer> arr = new ArrayList<Integer>();
		arr.add(0);
		arr.add(1);
		
		int temp = 0;
		
		for (int i = 2; i <= number; i++) {
			temp = arr.get(i - 1) + arr.get(i - 2);
			arr.add(i, temp);
		}
		return arr;
	}
}
