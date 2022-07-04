package com.turkcell;

import java.util.Vector;

public class _68_List_LAV4<T> {
	
	public static void main(String[] args) {
		vectorLoop();
	}
	
	public static void vectorLoop() {
		// Vector: defaultta 10 elaman olarak calisir
		// Java 1.2 surumunden bu zamana kadar gelen dinamik dizi icin kullanabilirsiniz
		
		// Generics olmadan yazilan vector
		Vector vector = new Vector();
		vector.add("Samsun");
		vector.add("Istanbul");
		vector.add("Antalya");
		
		System.out.println("Size: " + vector.size());
		
		for (Object temp : vector) {
			System.out.print(temp + " ");
		}
		
		System.out.println();
		System.out.println("************");
		
		// Generic olarak yazilan vector
		Vector<String> vector2 = new Vector<String>();
		
		vector2.add("Turkey");
		vector2.add("England");
		vector2.add("Germany");
		
		for (Object temp : vector2) {
			System.out.print(temp + " ");
		}
		
		System.out.println();
		
		// Generic olarak yazilan vector
		Vector<String> vector3 = new Vector<String>();
		vector3.add("BMW");
		vector3.add("Wolkswagen");
		vector3.add("Mercedes");
		
		System.out.println("Size: " + vector3.size());
		
		for (Object temp : vector3) {
			System.out.print(temp + " ");
		}
		
	}
	
}
