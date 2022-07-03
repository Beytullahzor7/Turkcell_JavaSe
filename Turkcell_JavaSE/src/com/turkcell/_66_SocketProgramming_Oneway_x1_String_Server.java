package com.turkcell;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

// One Way (Clint-Server String examples)
// Client kullanicidan aldigi veriyi Servera göndersin
// Server gelen bu data alsin büyük harflere ve length hesaplayan algoritma ?

// Unutma:
// 1-)öncelikle Serveri, calistirmalisin. Sonra Clienti calistiriyoruz.
// 2-) PSVM ==> Serverda olur.
// 3-) java.net kütüphanesini import ediyoruz

// Random 49152<=X<=65535
public class _66_SocketProgramming_Oneway_x1_String_Server {
	
	// Server Method Kisa Yol
	public static void serverMethod() {
		
		String clientValue, bigLetter;
		System.out.println("Server Hazir...");
		
		// java.net.SocketException: Socket is not bound yet: Port eklenmemis
		// java.net.BindException: Address already in use: bind : Ayni Portu Tekrar
		// kullandiniz
		// server: Clienttan gelen veriyi okumasi gerekiyor.
		System.out.println("Port: " + _66_SocketProgramming.PORT);
		
		try (DataInputStream dataInputStream = new DataInputStream(
				new ServerSocket(_66_SocketProgramming.PORT).accept().getInputStream())) {
			clientValue = dataInputStream.readUTF();
			bigLetter = clientValue.toUpperCase();
			System.out.println();
			System.out.println(bigLetter + " Harf Sayisi: " + bigLetter.length());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	// Server Method Uzun Yol
	public static void serverMethod2() {
		try {
			int portNumber = _66_SocketProgramming.generateRandomPort();
			System.out.println("Port Number : " + portNumber);
			
			// java.net.SocketException : Socket is not bound yet = port eklenmemis
			// java.net.BindException : Address already in use = ayni portu tekrarlar
			// Server clienttan gelen veriyi okumasi gerekiyor
			ServerSocket socket = new ServerSocket(portNumber);
			Socket successPort = socket.accept();
			InputStreamReader inputStreamReader = new InputStreamReader(successPort.getInputStream());
			BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
			
			// BufferedReader bufferedReader2=new BufferedReader(new InputStreamReader((new
			// ServerSocket(4999).accept().getInputStream())));
			
			String str = bufferedReader.readLine();
			System.out.println("Client:" + str);
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	
	public static void main(String[] args) {
		serverMethod();
	}
	
}
