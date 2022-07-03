package com.turkcell;

import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;

import javax.swing.JOptionPane;

public class _66_SocketProgramming_Oneway_x2_String_Client {
	
	// Client Method
	public static void clientMethod() {
		
		// Kullanicidan alacagim veri
		String vocabulary = JOptionPane.showInputDialog("Lütfen birseyler yaziniz");
		
		try (DataOutputStream dataOutputStream = new DataOutputStream(
				new Socket(_66_SocketProgramming.ipAddress, _66_SocketProgramming.PORT).getOutputStream())) {
			dataOutputStream.writeUTF(vocabulary);
		} catch (IOException e) {
			System.out.println("Client Method IOException Error ");
			e.printStackTrace();
		} catch (Exception e) {
			System.out.println("Client Method Error ");
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		clientMethod();
	}
}
