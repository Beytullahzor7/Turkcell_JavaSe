package com.turkcell;

import java.util.StringTokenizer;

public class _17_StringTokenizer {
	
	public static void main(String[] args) {
		// Not: bo�luk bir karakterdir &nbsp;
		String kelime = "Java+ jsp$jsf servlet~Spring framework springmvc springdata springrest spring$security";
		
		// 1-) par�alamak
		String[] parcala = kelime.split(" ");
		for (String temp : parcala) {
			System.out.println(temp);
		}
		
		System.out.println("*********************************************");
		// 2-) par�alama
		StringTokenizer stringTokenizer = new StringTokenizer(kelime, "+~&$ ");
		while (stringTokenizer.hasMoreTokens()) {
			System.out.println(stringTokenizer.nextToken());
		}
	}
}
