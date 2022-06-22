package com.turkcell;

public class _13_Cast {
	
	public static void main(String[] args) {
		// casting
		// 1
		float f1 = 44.55f;
		float f2 = 55.22f;
		long l1 = 13245678L;
		
		// 2
		byte b1 = 12;
		long l2 = b1; // veri kaybý yoktur
		
		long l3 = 1321351;
		byte b3 = (byte) l3;
		System.out.println(b3); // veri kaybý vardýr (narrowing casting)
		
		// 3) boxing-unboxing
		int primitive = 55;
		Integer wrapper = primitive; // boxing: primitive To wrapper
		
		Double wrapper2 = 455.12; // unboxing: wrapper To primitive
		double primitive2 = wrapper2;
		
		// 4) String To int
		String str = "55";
		int cast1 = Integer.valueOf(str); // string to int (OBJECT TYPE)
		int cast2 = Integer.parseInt(str); // string to int (PRIMITIVE TYPE)
		System.out.println(cast1 + 15);
		System.out.println(cast2 + 15);
		
		int number = 55;
		String cast3 = String.valueOf(number); // int to String
		String cast4 = Integer.toString(number);
		System.out.println(cast3 + 15);
		System.out.println(cast4 + 15);
		
	}
	
}
