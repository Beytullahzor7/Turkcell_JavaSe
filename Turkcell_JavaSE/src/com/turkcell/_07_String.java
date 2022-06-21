package com.turkcell;

public class _07_String {
	
	public static void main(String[] args) {
		String kelime = "Java ogreniyorum Java";
		
		System.out.println(kelime.length());
		System.out.println(kelime.trim().length());
		
		System.out.println(kelime.toUpperCase());
		System.out.println(kelime.toLowerCase());
		
		System.out.println(kelime.startsWith("J"));
		System.out.println(kelime.endsWith("m"));
		
		System.out.println(kelime.concat("sona ekle"));
		System.out.println(kelime.replace(kelime, "yenisi"));
		
		System.out.println(kelime.contains("Java"));
		System.out.println(kelime.charAt(0));
		
		System.out.println(kelime.indexOf("Java"));
		System.out.println(kelime.lastIndexOf("Java"));
		
		System.out.println(kelime.substring(2)); // 2. indexten en sona kadar alır
		System.out.println(kelime.substring(0, 4));
		
		// Kelimenin son 2 karakterini göster
		System.out.println(kelime.substring(19));
		
		System.out.println(kelime.isEmpty());
		
		System.out.println(kelime.equals("Java"));
		System.out.println(kelime.equalsIgnoreCase(kelime));
		
	}
	
}
