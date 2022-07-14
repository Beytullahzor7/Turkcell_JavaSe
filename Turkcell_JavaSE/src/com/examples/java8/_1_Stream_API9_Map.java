package com.examples.java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class _1_Stream_API9_Map {
	public static void main(String[] args) {
		
		List<String> listem = Arrays.asList("malatya", "istanbul", "ankara", "malatya", "bursa", "bolu");
		
		// map --> Veri uzerinde manipulasyon islemi yapmamizi saglar
		List<String> list2 = listem.stream().distinct().sorted().map(i -> i.toUpperCase()).collect(Collectors.toList());
		list2.forEach(System.out::println);
		
	}
}
