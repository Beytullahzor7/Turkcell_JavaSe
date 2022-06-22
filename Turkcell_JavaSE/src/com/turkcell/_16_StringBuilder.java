package com.turkcell;

public class _16_StringBuilder {
	
	public static void main(String[] args) {
		
		String str1 = "Java", str2 = "Spring", str3 = "database";
		
		String add = str1 + str2 + str3;
		
		String strConcat = str1.concat(str2).concat(str3);
		
		// BUILDER
		StringBuilder builder = new StringBuilder();
		builder.append(str1).append(str2).append(str3);
		String cast = builder.toString();
		System.out.println(cast);
		
		// BUFFER
		StringBuffer buffer = new StringBuffer();
		buffer.append(str1).append(str2).append(str3);
		String cast2 = builder.toString();
		System.out.println(cast2);
	}
	
}
