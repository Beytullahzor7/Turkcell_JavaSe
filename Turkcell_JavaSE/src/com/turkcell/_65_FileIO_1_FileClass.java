package com.turkcell;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class _65_FileIO_1_FileClass {
	
	// Nesne Degiskenleri (Object Variable)
	private String path;
	private final String date = createdDate();
	
	// Parametresiz Constructor
	public _65_FileIO_1_FileClass() {
		this.path = "C:\\Javakamp\\Turkcell_JavaSe\\data.txt";
		File file = new File("C:\\Javakamp\\Turkcell_JavaSe\\data.txt");
		
		try {
			if (file.createNewFile()) {
				System.out.println("data.txt olusturuldu");
			} else {
				System.out.println("data.txt dosyasi zaten var");
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	// Parametreli Constructor
	public _65_FileIO_1_FileClass(String path) {
		this.path = path;
	}
	
	private String createdDate() {
		Locale locale = new Locale("tr", "TR");
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MMMM/yyyy HH:mm:ss", locale);
		
		return dateFormat.format(new Date());
	}
	
	public String getPath() {
		return path;
	}
	
	public void setPath(String path) {
		this.path = path;
	}
	
	public String getDate() {
		return date;
	}
	
}
