package com.examples.java8;

import java.util.List;
import java.util.function.Predicate;

/*
 * Java 8 ile gelmis fonksiyonel bir programlamadir
 * Verilerle hizli ve efektif olarak islem yapmamiza olanak saglar
 * Veri yapilari degildir bundan dolayi var olan kaynagi degistirmez
 * Java.util.stream kutuphanesinden gelir
 * BaseStream Interfacesinden turer
 * Cesitleri : intStream,LongStream,DoubleStream,Stream
 * Stream : 2 grup calisma sitili vardir
 * 1) Sequential : Senkrondur yani ayni anda sadece 1
 * 2-) Paralel : Asenkrondur yani ayni anda birden fazla islem yapabilir.)
 */

public class StreamAPI_Description {
	public static void main(String[] args) {
		basicArrayExample();
		basicStreamExample();
		
	}
	
	// Dizi ile 2 ile bolunebilen sayilari toplayin
	public static void basicArrayExample() {
		
		int[] dizi = { 1, 2, 3, 4, 5, 6, 7, 8 };
		
		int toplam = 0;
		
		for (int i = 0; i < dizi.length; i++) {
			if (dizi[i] % 2 == 0) {
				toplam += dizi[i];
			}
		}
		
		System.out.println("Array " + toplam);
	}
	
	// Stream ile 2 ye bolunebilen sayilarin toplamini bulmak
	public static void basicStreamExample() {
		List<Integer> list = List.of(1, 2, 3, 4, 5, 6, 7, 8);
		
		int toplam = list.stream().filter(i -> i % 2 == 0).reduce(Integer::sum).orElse(0);
		int toplam2 = list.stream().filter(i -> i % 2 == 0).reduce(0, (x, y) -> (x + y));
		
		System.out.println("Stream " + toplam);
		System.out.println("Stream " + toplam2);
		
		// PREDICATE: java.util.function
		Predicate<Integer> ciftSayilar = temp -> temp % 2 == 0;
		int toplam3 = list.stream().filter(ciftSayilar).reduce(0, (x, y) -> (x + y));
		System.out.println("Predicate " + toplam3);
	}
	
}
