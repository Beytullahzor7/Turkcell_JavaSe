package com.turkcell;

public class _47_Palindrome {
	
	public static void main(String[] args) {
		System.out.println(isPalindrome2("never odd or even"));
	}
	
	public static boolean isPalindrome(String str) {
		StringBuilder builder = new StringBuilder();
		
		for (int i = str.length() - 1; i >= 0; i--) {
			builder.append(str.charAt(i));
		}
		
		String reversedStr = builder.toString();
		System.out.println("Reversed String: " + reversedStr);
		
		if (reversedStr.equals(str)) {
			return true;
		} else {
			return false;
		}
	}
	
	public static boolean isPalindrome2(String str) {
		String withoutSpace = str.replaceAll("\\s", ""); // removes all whitespaces
		System.out.println(withoutSpace);
		
		StringBuilder builder = new StringBuilder(withoutSpace).reverse();
		String reversedStr = builder.toString();
		
		return reversedStr.equals(withoutSpace);
	}
}
