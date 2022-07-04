package com.turkcell;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class _68_List_LAV5_Collections {
	
	// Collections:
	// Java.util paketinden gelir
	// java.util.Collections.sort(listem);
	// Collections.sort(listem);
	public static void main(String[] args) {
		collectionLoop();
		
	}
	
	public static void collectionLoop() {
		// Diamond operatoru java 1.7 ile gelmistir
		List<Integer> list = new ArrayList<Integer>();
		list.add(50);
		list.add(20);
		list.add(10);
		list.add(80);
		list.add(60);
		
		// sort(): Listeyi kucukten buyuge siralar
		Collections.sort(list);
		list.forEach(System.out::println);
		
		System.out.println("********************");
		
		// reverse(): Listeyi ters cevirir
		Collections.reverse(list);
		list.forEach(System.out::println);
		
		System.out.println("********************");
		
		// shuffle(): Listeyi rasgele siralar
		Collections.shuffle(list);
		list.forEach(System.out::println);
		
		System.out.println("********************");
		
		/*
		 * binarySearch(): Ikili aramadir. Saymaya 0. indisten baslar
		 * Oncelikle buyukten kucuge dogru siralama yapilmasi gerekir
		 * sonrasinda liste 2 ye bolunur ve aradigimiz deger hangi tarafa
		 * daha yakinsa o kisim icerisinde arama islemi gerceklestirilir
		 */
		
		Collections.sort(list);
		Iterator<Integer> iterator = list.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
		System.out.println(Collections.binarySearch(list, 60));
		
		System.out.println("********************");
		
		// unmodifiableList: Bundan sonra listeye veri eklemek istemiyorum
		// exception type: Exception thread in "main"
		// java.lang.UnsupportedOperationException
		
		list = Collections.unmodifiableList(list);
		list.add(2); // Throws an exception
		
	}
	
}
