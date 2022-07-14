package com.examples.java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class _1_Stream_API06_Limit {
	
	public static void main(String[] args) {
		List<String> list = Arrays.asList("Malatya", "Istanbul", "Ankara", "Malatya", "Bursa", "Bolu");
		
		// limit --> SQL deki limit ile ayni mantikta calisir
		List<String> list2 = list.stream().sorted().limit(3).collect(Collectors.toList());
		list2.forEach(System.out::println);
		
	}
	
}
