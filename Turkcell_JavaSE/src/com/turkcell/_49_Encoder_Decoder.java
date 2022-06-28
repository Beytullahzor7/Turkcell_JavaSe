package com.turkcell;

import java.util.Base64;
import java.util.Base64.Decoder;
import java.util.Base64.Encoder;
import java.util.Scanner;

public class _49_Encoder_Decoder {
	// Encoder(Þifrelemek) Decoder(Çözmek)
	// Encoder : yazýlýmda Bir kelimeyi belli bir formatta þifreleme için kullanýlýr
	// Decoder: yazýlýmda Þifrelenmiþ bir kodu, Çözmek için kullanýlýr
	// Base64 kütüphanesini kullanýrýz.
	// Encoder-Decoder JWT en çok kullanýyoruz.
	// Neden kullanýyoruz ? Büyük verilerde az yer kaplar.
	// Decoder-Encoder , MD5,SHA ile karýþtýrmayalým ......
	
	public static void main(String[] args) {
		encoderDecoderMainMethod();
	}
	
	public static String userData() {
		Scanner input = new Scanner(System.in);
		System.out.print("Lutfen bir seyler yaziniz : ");
		
		String vocabulary = input.nextLine();
		return vocabulary;
	}
	
	// Encoder Method
	public static String getEncoder(String vocabulary) {
		Encoder encoder = Base64.getEncoder();
		String encrypted = encoder.encodeToString(vocabulary.getBytes());
		return encrypted;
	}
	
	// Decoder Method
	public static String getDecoder(String vocabulary) {
		Decoder decoder = Base64.getDecoder();
		String solved = new String(decoder.decode(vocabulary));
		return solved;
	}
	
	public static void encoderDecoderMainMethod() {
		String kelime = userData();
		System.out.println("ilk hali: " + kelime);
		
		// Encoder(Þifreleme)
		String encrypted = getEncoder(kelime);
		System.out.println("sifrelenmis data" + encrypted);
		
		// Decoder(Çözmek)
		String solved = getDecoder(getEncoder(kelime));
		System.out.println("cozulmus data: " + solved);
	}
	
}
