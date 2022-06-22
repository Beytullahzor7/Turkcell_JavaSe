package com.turkcell;

import javax.swing.JOptionPane;

public class _14_JOptional {
	
	public static void main(String[] args) {
		// JOptionPane
		
		String str = JOptionPane.showInputDialog("Lütfen bir sayi giriniz: ");
		int number2 = Integer.valueOf(str);
		int number3 = Integer.parseInt(str);
		int number4 = Integer.parseInt(JOptionPane.showInputDialog("Lutfen bir sayi giriniz "));
		System.out.println(number4 + 5);
		
	}
	
}
