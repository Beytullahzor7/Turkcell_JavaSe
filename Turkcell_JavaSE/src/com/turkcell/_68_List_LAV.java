package com.turkcell;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// List : LAV
// List bir interface'dir.
// java.util paketinde gelir

// LinkedList: Araya yerlestirme, silme islemlerinde bicilmis kaftan

// ArrayList: Ekleme ve Arama için bicilmis kaftan

// Vector: veri defaulta 10 bunun dolacagini anladiginda dinamik olarak hafiza
// uzayi artirir.

// Stack = LIFO
// LIST = Asenkron ve indis olarak calisiyor

public class _68_List_LAV {
	
	public static void main(String[] args) {
		listLoop();
	}
	
	public static void listLoop() {
		// Java 1.7 ile gelen diamond operator
		
		List<String> myList = new ArrayList();
		
		myList.add("Samsun");
		myList.add("Ankara");
		myList.add("Izmir");
		
		// 1) Iterative for dongusu, eger indis lazimsa
		for (int i = 0; i < myList.size(); i++) {
			System.out.print(myList.get(i) + " ");
		}
		
		System.out.println();
		
		// 2) Indis lazim degilse foreach dongusu kullanilir
		for (String temp : myList) {
			System.out.print(temp + " ");
		}
		
		System.out.println();
		
		// 3) Iterator dongusu java.util paketinden turer
		Iterator<String> iterator = myList.iterator();
		while (iterator.hasNext()) {
			System.out.print(iterator.next() + " ");
		}
		
		System.out.println();
		
		// 4) Java 8 ile gelen StreamAPI, for dongulerinin fonksiyonel halidir
		myList.stream().forEach(System.out::printf);
		
	}
	
}
