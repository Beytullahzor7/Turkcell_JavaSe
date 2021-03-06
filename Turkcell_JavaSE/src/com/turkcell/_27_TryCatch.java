package com.turkcell;

public class _27_TryCatch {
	
	public static void main(String[] args) {
		// syntax error
		// intx number = 4 / 1;
		// System.out.println(number);
		
		// logic error: tanımsız,
		
		try {
			int number = 4 / 0;
			System.out.println(number);
			
		} catch (ArithmeticException ae) {
			ae.printStackTrace();
			fakeMailSend(ae.getMessage());
			fakeMailSend(ae.toString());
			
		} finally {
			System.out.println("mutlaka calisacak yerdir. db.close() port.close()");
		}
	}
	
	public static void fakeMailSend(String data) {
		System.out.println("admine mail gonderildi" + data);
	}
	
}
