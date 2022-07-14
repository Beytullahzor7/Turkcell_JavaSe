package com.turkcell;

import java.util.Arrays;
import java.util.List;

public class _68_List_LAV6_FilterMain {
	
	public static void main(String[] args) {
		
		_68_List_LAV6_FilterClass obje1 = new _68_List_LAV6_FilterClass(1, "Beytullah Zor", 100);
		_68_List_LAV6_FilterClass obje2 = new _68_List_LAV6_FilterClass(2, "Mehmet Yilmaz", 200);
		_68_List_LAV6_FilterClass obje3 = new _68_List_LAV6_FilterClass(3, "Burak Kaya", 300);
		
		List<_68_List_LAV6_FilterClass> list = Arrays.asList(obje1, obje2, obje3);
		
		for (_68_List_LAV6_FilterClass temp : list) {
			if (temp.getPrice() >= 200) {
				System.out.println(temp);
			}
		}
		
		System.out.println("--------------------------");
		
		// Stream API
		list.stream().filter(i -> i.getPrice() >= 200).forEach(System.out::println);
	}
}
