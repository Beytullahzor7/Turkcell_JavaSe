package com.turkcell;

import java.util.Scanner;

public class _56_ArrayLogin {
	// Class de�i�kenlerimiz
	private static int COUNTER = 4;
	private static final String DEFAULT_USERNAME = "admin";
	private static final String DEFAULT_PASSWORD = "root";
	
	// username,password dizi
	private static String[] userLogin() {
		Scanner klavye = new Scanner(System.in);
		
		String userName, userPassword;
		
		System.out.print("L�tfen username giriniz : ");
		userName = klavye.nextLine();
		
		System.out.print("L�tfen userPassword giriniz : ");
		userPassword = klavye.nextLine();
		
		String[] arr = { userName, userPassword };
		
		for (String temp : arr) {
			System.out.print(temp + " ");
		}
		return arr;
	}
	
	// admin page
	private static void adminMethod() {
		System.out.println("ADMIN PAGE HO�GELDINIZ");
		System.exit(0);
	}
	
	// validation method
	public static void userValidation(String[] arr) {
		String[] userInfo = arr;
		
		if (COUNTER >= 0) {
			if (userInfo[0].equals(DEFAULT_USERNAME) && userInfo[1].equals(DEFAULT_PASSWORD)) {
				System.out.println("Admin sayfas�na gidiyorsunuz");
				adminMethod();
			} else {
				COUNTER--;
				System.out.println("\n\nKalan hakk�n�z: " + COUNTER);
				if (COUNTER == 0) {
					System.out.println("Hak�n�z kalmad� hesab�n�z bloke oldu admine basvurunuz. 111 22 33");
					System.exit(0);
				}
			}
		}
	}
	
	public static void main(String[] args) {
		while (true) {
			String[] dizi = userLogin();
			userValidation(dizi);
		}
	}
}
