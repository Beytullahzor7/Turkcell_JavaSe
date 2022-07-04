package com.turkcell;

import java.util.LinkedList;
import java.util.List;

public class _68_List_LAV3<T> {
	
	public static void main(String[] args) {
		listLoop();
	}
	
	public static void listLoop() {
		
		List<String> myList = new LinkedList();
		myList.add("Turkey");
		myList.add("US");
		myList.add("Germany");
		myList.add("England");
		
		for (String temp : myList) {
			System.out.print(temp + " ");
		}
	}
	
}
