package com.turkcell;

// Generics:
// <>
// Tür problemlerini çözer
// casting ile uðraþmazsýnýz
// dynamics
// var ==> java 10 gelen (Object)
// Tüm referans tipleri barýndýrýr.

// Generics Class
public class _68_Generics<T> {
	
	// Generics Object Variable
	private T data;
	
	// getter and setter
	public T getData() {
		return data;
	}
	
	public void setData(T data) {
		this.data = data;
	}
	
	// Generics Parametresiz Constructor
	public _68_Generics() {
		
	}
	
	// Generics Parametreli Constructor
	public _68_Generics(T data) {
		this.data = data;
	}
	
	// Normal method
	public void normalMethod(String data) {
		System.out.println(data);
	}
	
	// Generic Method
	// dikkat: class ile ayni generic sembolu kullanma yani "T" kullanma
	public <K> void genericsMethod(K data) {
		System.out.println(data);
	}
	
	// Generic Method
	// dikkat: class ile ayni generic sembolu kullanma yani "T" kullanma
	public <K> void genericsMethod2(K data1, K data2) {
		System.out.println(data1 + " " + data2);
	}
	
	public static void main(String[] args) {
		
		// Dinamik bir veri gonderim sekli
		System.out.println("***** Dinamik Veri *****");
		_68_Generics sinif = new _68_Generics();
		sinif.setData(true);
		System.out.println(sinif.getData());
		System.out.println();
		
		System.out.println("***** Generics Method *****");
		sinif.normalMethod("Normal Method");
		sinif.genericsMethod(true);
		sinif.genericsMethod2(true, "Merhaba");
		System.out.println();
		
		// Dinamik bir veri parametreli constructor gonderim sekli
		System.out.println("***** Dinamik Veri Parametreli Constructor *****");
		_68_Generics sinif2 = new _68_Generics("const");
		System.out.println(sinif2.getData());
		System.out.println();
		
		// Generic Type
		System.out.println("***** Dinamik Generics Bir Veri Parametreli Constructor *****");
		_68_Generics<Boolean> sinif3 = new _68_Generics();
		sinif3.setData(true);
		System.out.println(sinif3.getData());
		
	}
	
}
