package com.turkcell;

import java.util.Scanner;

public class _34_Radar {
	
	private static int AMOUNT = 0;
	private static int REPEAT = 0;
	
	public static void main(String[] args) {
		// Kullanıcı tarafında girilen sayının :
		// hız: 80 hızlı yavaşlayın para cezası: 800 TL
		// hız: 95 orta hızlı yavaşlayın para cezası: 1200 TL
		// hız: 120 çok hızlı yavaşlayın para cezası: 2000 TL
		
		for (;;) {
			Scanner input = new Scanner(System.in);
			
			System.out.print("Input a Speed: ");
			int speed = input.nextInt();
			payFine(speed);
			System.out.println(REPEAT + " kez ceza yediniz");
		}
	}
	
	public static void payFine(int speed) {
		REPEAT++;
		int speedAbs = Math.abs(speed);
		
		if (80 <= speedAbs && speedAbs <= 94) {
			AMOUNT += 800;
			System.out.println(speedAbs + " hizli yavaslayin para cezasi: " + AMOUNT + " TL");
		}
		
		else if (95 <= speedAbs && speedAbs <= 119) {
			AMOUNT += 1200;
			System.out.println(speedAbs + " orta hizli yavaslayin para cezasi: " + AMOUNT + " TL");
		}
		
		else if (speedAbs >= 120) {
			AMOUNT += 2000;
			System.out.println(speedAbs + " cok hizli yavaslayin para cezasi: " + AMOUNT + " TL");
		} else {
			System.out.println("Wrong Speed");
		}
	}
}
