package com.turkcell;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class _68_List_LAV7_Queue {
	
	// QUEUE
	// queue için: iki tarafi açik bir daire düþünebiliriz
	// FIFO (First In First Out) ==> Ilk giren Ilk cikar
	// java.util paketinden gelir
	
	// verileri almka Iterator döngüsünden almak gerekir
	
	// push ==>Eklemek
	// pop ==> çikarmak
	// peek==> en üstteki eleman anlamina gelir.
	
	public static void queueMethod() {
		Queue<String> queue = new LinkedList();
		queue.add("1.eleman");
		queue.add("2.eleman");
		queue.add("3.eleman");
		queue.add("100. eleman");
		
		System.out.println("En Üst Veri: " + queue.peek());
		System.out.println("*****************");
		
		Iterator iterator = queue.iterator();
		while (iterator.hasNext()) {
			System.out.print(iterator.next() + " ");
		}
		
		queue.clear();
		
	}
	
	public static void main(String[] args) {
		queueMethod();
	}
	
}
