package com.turkcell;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class _69_Set_HLT1 {
	
	/*
	 * Set : tekrarsiz veriler icin kullanilir
	 * ---------------------------------------
	 * HashSet : Set icerisine ekledigimiz verileri rasgele sirada bize gosterir
	 * LinkedHashSet : Set icerisine ekledigimiz verileri eklenen sira ile bize
	 * gosterir
	 * TreeSet : Kucukten buyuge sýralama islemini gerceklestirir
	 * java.util paketinde gelir
	 * Set icerisinde get(), indexOf(), lastIndexOf() metodlari bulunmaz
	 */
	
	public static void main(String[] args) {
		setTutorials();
	}
	
	public static void setTutorials() {
		Set<String> iller = new LinkedHashSet<String>();
		iller.add("Samsun");
		iller.add("Ankara");
		iller.add("Izmir");
		
		// forEeach
		for (String temp : iller) {
			System.out.println(temp);
		}
		
		System.out.println("-------------------");
		
		// Iterator
		Iterator<String> iterator = iller.iterator();
		
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
		// set To Array
		iller.toArray();
		
		// eleman sayisi
		iller.size();
		
		// bos mu?
		iller.isEmpty();
		
		// listedeki verileri temizlemek
		iller.clear();
		
	}
}
