package com.turkcell;

import java.util.Arrays;

public class _51_ArrayBinarySearch {
	
	public static void main(String[] args) {
		int[] dizi = { 1, 9, 6, 2 };
		
		// dizileri s�ralamak i�in kullan�l�r
		Arrays.sort(dizi); // 1 2 6 9
		
		// Arrays.binarySearch()
		int number = 9;
		int result = Arrays.binarySearch(dizi, number);
		if (result > 0) {
			System.out.println("Arad���n�z say� " + number + " vard�r. " + result + ". indistedir ");
		} else {
			System.out.println("Arad���n�z yoktur ");
		}
		
		// forEach
		for (int temp : dizi) {
			System.out.print(temp + " ");
		}
		
	}
	
}
