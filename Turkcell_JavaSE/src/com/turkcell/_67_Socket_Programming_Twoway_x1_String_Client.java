package com.turkcell;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.Socket;

public class _67_Socket_Programming_Twoway_x1_String_Client {
	
	public static void main(String[] args) {
		String receiveMessage = null;// mesaj almak
		String sendMessage; // mesaj göndersin
		
		try {
			Socket socket = new Socket("localhost", 8586);
			
			// Client veri gönderecek
			BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
			OutputStream outputStream = socket.getOutputStream();
			PrintWriter printWriter = new PrintWriter(outputStream, true);
			
			// serverdan gelen veriyi almak
			InputStream inputStream = socket.getInputStream();
			BufferedReader bufferedReader2 = new BufferedReader(new InputStreamReader(inputStream));
			System.out.println("Client: Lütfen mesaj yaziniz ");
			
			while (true) {
				// clientten veri almak
				receiveMessage = bufferedReader.readLine();
				printWriter.println(receiveMessage);
				printWriter.flush();
				
				if ((receiveMessage = bufferedReader2.readLine()) != null) {
					System.out.println("Client: " + receiveMessage);
					_67_SocketProgramming_Write.toWrite("Client: " + receiveMessage);
				}
				
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
