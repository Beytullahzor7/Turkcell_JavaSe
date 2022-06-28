package com.turkcell;

public class _50_Diziler {
	
	public static void main(String[] args) {
		int[] dizi = new int[6];
		dizi[0] = 1;
		dizi[3] = 3;
		dizi[4] = 4;
		dizi[5] = 5;
		
		// iterative for
		for (int i = 0; i < dizi.length; i++) {
			System.out.print(dizi[i] + " ");
		}
		
		System.out.println("\n***************");
		
		// forEach dongusu:sadece ekranda gostermek istiyorsak
		// forEach dongusu:indisi numarasý bize gerekmiyorsa
		for (int temp : dizi) {
			System.out.print(temp + " ");
		}
		
	}
	
}
