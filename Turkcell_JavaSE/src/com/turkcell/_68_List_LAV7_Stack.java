package com.turkcell;

import java.util.Stack;

public class _68_List_LAV7_Stack {
	
	// stack:
	// stack için: Kapali bir kutu düsünebiliriz
	// LIFO (Last In First Out) ==> Son giren Ilk Çikar
	// java.util paketinden gelir
	
	// push ==>Eklemek
	// pop ==> çikarmak
	// peek==> en üstteki eleman anlamina gelir.
	
	public static void main(String[] args) {
		stackMethod();
	}
	
	public static void stackMethod() {
		Stack<String> stack = new Stack<String>();
		stack.add("1.eleman");
		stack.add("2.eleman");
		stack.add("3.eleman");
		stack.add("100. eleman");
		
		System.out.println("En ustteki veri: " + stack.peek()); // en sonda yer alan elemaný gosterir (LIFO)
		
		System.out.println("*********************");
		
		stack.pop(); // sondaki elemani stackten siler
		
		for (int i = 0; i < stack.size(); i++) {
			System.out.println(stack.get(i));
		}
		
		System.out.println("**********************");
		
		stack.push("4.eleman");
		for (int i = 0; i < stack.size(); i++) {
			System.out.println(stack.get(i));
		}
	}
	
}
