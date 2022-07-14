package com.examples.java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class _1_Stream_API08_Distinct {
	
	public static void main(String[] args) {
		List<String> list = Arrays.asList("Malatya", "Istanbul", "Bursa", "Ankara", "Malatya", "Bursa", "Bolu");
		
		// distinct --> Liste icerisindeki verileri tekrarsiz olarak gosterir
		List<String> distinctList = list.stream().distinct().collect(Collectors.toList());
		distinctList.forEach(System.out::println);
	}
	
}
