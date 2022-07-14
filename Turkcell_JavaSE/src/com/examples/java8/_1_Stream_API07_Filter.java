package com.examples.java8;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class _1_Stream_API07_Filter {
	
	public static void main(String[] args) {
		List<String> list = Arrays.asList("Malatya", "Istanbul", "Ankara", "Malatya", "Bursa", "Bolu");
		
		// Liste icerisinde malatya gecmeyenleri kucukten buyuge dogru
		// siralayalim ve ilk 3 veriyi ekrana getirelim
		
		List<String> newList = list.stream().filter((i -> !"malatya".equals(i.toLowerCase()))).map(i -> i.toUpperCase())
				.sorted(Comparator.reverseOrder()).limit(2).collect(Collectors.toList());
		
		newList.forEach(System.out::println);
		
	}
	
}
