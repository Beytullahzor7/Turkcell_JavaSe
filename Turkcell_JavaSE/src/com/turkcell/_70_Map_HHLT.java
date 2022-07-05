package com.turkcell;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.UUID;

public class _70_Map_HHLT {
	
	/*
	 * Map : key-value seklinde calisir ve bir interfacedir
	 * Map<Key, Value>
	 * HHLT
	 * HashTable : null deger veremezsiniz
	 * HashMap : Rasgele sirada bize doner ve tekrarsiz veridir
	 * LinkedHashMap : Ekledigimiz sirada bize gosterir ve tekrarsiz veridir
	 * TreeMap : Kucukten buyuge tekrarsiz
	 */
	
	public static void main(String[] args) {
		mapTutotials();
		
	}
	
	public static UUID randomUUID() {
		UUID uuid = UUID.randomUUID();
		return uuid;
	}
	
	public static void mapTutotials() {
		Map<String, Object> mapList = new HashMap<String, Object>();
		
		mapList.put("1", "Istanbul");
		mapList.put("2", "Samsun");
		mapList.put("3", "Antalya");
		mapList.put("4", "Mugla");
		
		System.out.println("----------- KEY ----------");
		for (String key : mapList.keySet()) {
			System.out.print(key + " ");
		}
		
		System.out.println();
		
		System.out.println("--------- VALUE --------");
		for (Object value : mapList.values()) {
			System.out.print(value + " ");
		}
		
		System.out.println();
		
		System.out.println("------- KEY & VALUE --------");
		for (String key : mapList.keySet()) {
			System.out.println(key + " " + mapList.get(key));
		}
		
		System.out.println();
		
		System.out.println("------- ITERATOR ---------");
		
		Set<String> set = mapList.keySet();
		Iterator<String> iterator = set.iterator();
		
		while (iterator.hasNext()) {
			System.out.println(mapList.get(iterator.next()));
		}
		
		System.out.println("--------- M-E-l-es----------");
		
		for (Map.Entry<String, Object> temp : mapList.entrySet()) {
			System.out.println(temp);
		}
		
		System.out.println();
		
		System.out.println("------ Stream forEach ---------");
		
		mapList.entrySet().forEach(System.out::println);
		
	}
	
}
