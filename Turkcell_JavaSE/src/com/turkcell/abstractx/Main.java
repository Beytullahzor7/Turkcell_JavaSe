package com.turkcell.abstractx;

public class Main {
	
	public static void main(String[] args) {
		
		// Polymorophism
		Computer asus1 = new Asus("asus-cpu", "asus-ram", "asus-smartMainBoard", "asus-port", "asus-voiceRecognation");
		System.out.println(asus1);
		asus1.commonMethod();
		asus1.govdesizMethod("Asus Govdesiz");
		
		System.out.println("------------------------");
		
		Computer msi1 = new MSI("msi-cpu", "msi-ram", "msi-anakart", "msi-port");
		System.out.println(msi1);
		msi1.commonMethod();
		msi1.govdesizMethod("MSI Govdesiz");
		
	}
	
}
