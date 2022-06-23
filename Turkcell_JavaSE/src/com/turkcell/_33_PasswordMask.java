package com.turkcell;

import java.util.Arrays;
import java.util.Scanner;

public class _33_PasswordMask {
	
	public static void main(String[] args) {
		// kullanıcı tarafından girilen bir parola için ilk ve son harfi haricinde *
		// eklensin ?
		// Hamit ==> H****t
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Please input your password: ");
		String password = input.nextLine();
		
		System.out.println(inputPassword(password));
		
		// System.out.println(inputPassword2(password));
		
	}
	
	public static String inputPassword(String password) {
		StringBuilder builder = new StringBuilder();
		
		char firstIndex = password.charAt(0);
		char lastIndex = password.charAt(password.length() - 1);
		
		for (int i = 1; i < password.length() - 1; i++) {
			builder.append("*");
		}
		
		String result = builder.toString();
		return firstIndex + result + lastIndex;
	}
	
	public static String inputPassword2(String password) {
		Character[] arr = new Character[password.length()];
		
		for (int i = 0; i < password.length(); i++) {
			arr[i] = password.charAt(i);
		}
		
		for (int i = 1; i < password.length() - 1; i++) {
			arr[i] = '*';
		}
		
		return Arrays.toString(arr);
	}
}
