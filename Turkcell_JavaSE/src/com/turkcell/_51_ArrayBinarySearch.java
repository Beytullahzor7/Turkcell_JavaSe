package com.turkcell;

import java.util.Arrays;

public class _51_ArrayBinarySearch {
	
	public static void main(String[] args) {
		int[] dizi = { 1, 9, 6, 2 };
		
		// dizileri sýralamak için kullanýlýr
		Arrays.sort(dizi); // 1 2 6 9
		
		// Arrays.binarySearch()
		int number = 9;
		int result = Arrays.binarySearch(dizi, number);
		if (result > 0) {
			System.out.println("Aradýðýnýz sayý " + number + " vardýr. " + result + ". indistedir ");
		} else {
			System.out.println("Aradýðýnýz yoktur ");
		}
		
		// forEach
		for (int temp : dizi) {
			System.out.print(temp + " ");
		}
		
	}
	
}
