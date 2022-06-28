package com.turkcell;

import java.util.Base64;
import java.util.Base64.Decoder;
import java.util.Base64.Encoder;
import java.util.Scanner;

public class _49_Encoder_Decoder {
	// Encoder(�ifrelemek) Decoder(��zmek)
	// Encoder : yaz�l�mda Bir kelimeyi belli bir formatta �ifreleme i�in kullan�l�r
	// Decoder: yaz�l�mda �ifrelenmi� bir kodu, ��zmek i�in kullan�l�r
	// Base64 k�t�phanesini kullan�r�z.
	// Encoder-Decoder JWT en �ok kullan�yoruz.
	// Neden kullan�yoruz ? B�y�k verilerde az yer kaplar.
	// Decoder-Encoder , MD5,SHA ile kar��t�rmayal�m ......
	
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
		
		// Encoder(�ifreleme)
		String encrypted = getEncoder(kelime);
		System.out.println("sifrelenmis data" + encrypted);
		
		// Decoder(��zmek)
		String solved = getDecoder(getEncoder(kelime));
		System.out.println("cozulmus data: " + solved);
	}
	
}
