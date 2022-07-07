package com.interfaces;

public interface InterfaceTutorial {
	
	/*
	 * Interface bir arayuzdur
	 * Govdeli ve govdesiz method icerebilir
	 * interfaceyi kullanmak isteyen siniflar implements keywordunu alir
	 * istedigimiz kadar interfaceyi implemente edebiliriz
	 * Polymorphism yapabiliriz
	 * abstraction = interface + abstract
	 * inheritance-interface-abstract
	 * - temiz kod yazmamiza olanak saglar
	 * - maliyeti dusurur
	 * - polymorphism saglar
	 * - kod karmasikligindan kurtarir
	 * - az kod ile cok is yapmamizi saglar
	 * abstract -interface ortak özellikleri
	 * polymorphism yapabiliriz.
	 * soyutmalama yapabiliriz
	 * gövdeli metot yazabiliriz.
	 * gövdesiz metot yazabiliriz.
	 * interface icerisinde sabit degiskenler olusturabiliriz
	 */
	
	public void siteGit();
	
	public void sepeteEkle();
	
	public void ode();
	
	public String al(int sayi);
	
}
