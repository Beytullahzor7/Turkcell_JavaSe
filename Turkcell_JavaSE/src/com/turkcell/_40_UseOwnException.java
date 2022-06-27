package com.turkcell;

import java.util.Scanner;

public class _40_UseOwnException {
	
	public static void main(String[] args) throws _39_BeytullahZorException {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Bir sayi giriniz: ");
		int number = input.nextInt();
		
		if (number < 0) {
			throw new _39_BeytullahZorException("Sifirdan kucuk sayi girilemez");
		} else {
			System.out.println(Math.pow(number, 2));
		}
	}
}
