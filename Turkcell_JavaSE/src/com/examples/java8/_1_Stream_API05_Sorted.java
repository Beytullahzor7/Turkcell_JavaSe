package com.examples.java8;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class _1_Stream_API05_Sorted {
	
	public static void main(String[] args) {
		List<String> list = Arrays.asList("Malatya", "Istanbul", "Ankara", "Malatya", "Bursa", "Bolu");
		
		// Sorted --> Kucukten buyuge siralama yapar
		List<String> sortedList = list.stream().sorted().collect(Collectors.toList());
		sortedList.forEach(System.out::println);
		
		System.out.println("-----------------------------");
		
		// sorted(Comparator.reverseOrder()) --> Buyukten kucuge siralama yapar
		List<String> reverseSorted = list.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
		reverseSorted.forEach(System.out::println);
		
	}
	
}
