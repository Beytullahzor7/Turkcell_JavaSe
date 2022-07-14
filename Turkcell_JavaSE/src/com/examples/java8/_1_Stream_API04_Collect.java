package com.examples.java8;

import java.util.List;
import java.util.stream.Collectors;

public class _1_Stream_API04_Collect {
	
	public static void main(String[] args) {
		
		List<String> list = List.of("malatya", "istanbul", "ankara", "malatya", "bursa", "bolu");
		
		List<String> list2 = list.stream().collect(Collectors.toList());
		list.forEach(System.out::println);
		
	}
	
}
