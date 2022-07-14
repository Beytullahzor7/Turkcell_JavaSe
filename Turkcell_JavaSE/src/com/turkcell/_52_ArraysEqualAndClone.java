package com.turkcell;

import java.util.Arrays;

public class _52_ArraysEqualAndClone {
	
	public static void main(String[] args) {
		int[] dizi1 = { 1, 2, 3, 4, 5 };
		int[] dizi2 = { 1, 2, 3, 4, 5 };
		int[] dizi3 = dizi2.clone();
		
		if (Arrays.equals(dizi1, dizi2)) {
			System.out.println("Birebir aynidir");
		} else {
			System.out.println("Farkl� elemanda dizilerdir");
		}
		
	}
}
