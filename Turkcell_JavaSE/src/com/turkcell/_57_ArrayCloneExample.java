package com.turkcell;

import java.util.Arrays;

public class _57_ArrayCloneExample {
	
	public static void main(String[] args) {
		// Rastgele 1<=X<=10 olu�turulan 5 tane random orijinalArray ad�nda int dizisi
		// olu�tural�m
		// Olu�turulan bu diziyi(orijinalArray) cloneArray dizisine clone(iterative ve
		// dizi metoduyla yapal�m)
		
		cloneArrayProgram();
		
	}
	
	public static void cloneArrayProgram() {
		int[] orijinalArray = new int[5];
		
		for (int i = 0; i < 5; i++) {
			int randomNumber = (int) (Math.random() * 11);
			orijinalArray[i] = randomNumber;
		}
		
		System.out.print("Orijinal Array: " + Arrays.toString(orijinalArray));
		System.out.println();
		
		int[] cloneArray = orijinalArray.clone();
		System.out.print("Array Clone1 : " + Arrays.toString(cloneArray));
		System.out.println();
		
		int[] cloneArray2 = new int[5];
		
		for (int i = 0; i < 5; i++) {
			cloneArray2[i] = orijinalArray[i];
		}
		
		System.out.print("Array Clone2 : " + Arrays.toString(cloneArray2));
	}
}
