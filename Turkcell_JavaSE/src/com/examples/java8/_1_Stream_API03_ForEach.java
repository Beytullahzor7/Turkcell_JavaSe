package com.examples.java8;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class _1_Stream_API03_ForEach {
	
	public static void main(String[] args) {
		
		List<String> list = Arrays.asList("Samsun", "Ankara", "Izmir", "Antalya");
		
		System.out.println("-------Iterative For Dongusu-------");
		for (int i = 0; i < list.size(); i++) {
			System.out.print(list.get(i) + " ");
		}
		
		System.out.println();
		
		System.out.println("-------ForEach Dongusu-------");
		for (String temp : list) {
			System.out.print(temp + " ");
		}
		
		System.out.println();
		System.out.println("-------Iterator Dongu-------");
		
		Iterator iterator = list.iterator();
		while (iterator.hasNext()) {
			System.out.print(iterator.next() + " ");
		}
		
		System.out.println();
		System.out.println("-------Stream ForEach Dongusu-------");
		list.stream().forEach(System.out::println);
		
	}
}
