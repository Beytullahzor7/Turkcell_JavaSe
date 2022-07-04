package com.turkcell;

import java.util.ArrayList;
import java.util.List;

public class _68_List_LAV2<T> {
	
	public static void main(String[] args) {
		listLoop();
	}
	
	public static void listLoop() {
		List<String> list = new ArrayList();
		list.add("Karpuz");
		list.add("Cilek");
		list.add("Muz");
		list.add("Seftali");
		
		// List icerisinde indisler 0 dan baslar
		// get(): listedeki verilere erismek icin kullanilir.
		// Parametre olarak indis numarasi alir
		System.out.println("0. index: " + list.get(0));
		
		// size(): listenin eleman sayisini verir
		System.out.println("Listenin eleman sayisi: " + list.size());
		
		// indexOf(): icerisine verdigimiz degeri listenin solundan baslayarak okur
		// varsa kacinci
		// indexte oldugunu verir yoksa da -1 doner
		System.out.println("Index Of: " + list.indexOf("Muz"));
		
		// isEmpty(): Liste bos mu dolu mu bilgisini boolean olarak doner
		System.out.println("Is Empty: " + list.isEmpty());
		
		// toArray(): listeyi arraye cevirmek icin kullaniriz
		// Dikkat: Object turundedir. Eger Integer vs cevirmek istersem
		// Once Stringe sonra Integera cevirmeliyim
		// List ==> Array
		Object[] obj = list.toArray();
		for (Object temp : obj) {
			System.out.println(temp);
		}
		
		System.out.println();
		
		// subList(): Listeden istedigimiz aralikta veri gondersin
		for (String temp : list.subList(0, 3)) {
			System.out.println(temp);
		}
		
		System.out.println();
		
		// addAll() : Bir listeyi baska bir listeye tamamen ekler
		// ancak 2 liste ayni referans type olacak
		List<String> newList = new ArrayList();
		newList.add("55");
		newList.add("34");
		newList.addAll(list); // newListin icerisine list icinde var olan her seyi ekler
		newList.forEach(System.out::println);
		
		System.out.println();
		
		// remove(): Listedeki veriyi siler
		list.remove(0);
		list.remove("Muz");
		for (String temp : list) {
			System.out.println(temp);
		}
		
		// clear(): Liste icerisindeki butun elemanlarý siler
		list.clear();
		for (String temp : list) {
			System.out.println(temp + " ");
		}
		
	}
	
}
