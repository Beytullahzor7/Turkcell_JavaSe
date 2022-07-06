package com.turkcell.inheritance;

public class Main {
	
	public static void main(String[] args) {
		
		// Polymorophism
		Computer asus1 = new Asus("asus-cpu", "asus-ram", "asus-smartMainBoard", "asus-port", "asus-voiceRecognation");
		System.out.println(asus1);
		asus1.commonMethod();
		
		Computer msi1 = new MSI("msi-cpu", "msi-ram", "msi-anakart", "msi-port");
		System.out.println(msi1);
		msi1.commonMethod();
		
		Computer monster1 = new Monster("monster-cpu", "monster-ram", "monster-smartMainBoard", "monster-port", 15000);
		System.out.println(monster1);
		monster1.commonMethod();
		
	}
	
}
