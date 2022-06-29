package com.turkcell;

// Thread kullanim sekilleri:
// 1) extends ==> public class MultipleThreadExam extend Thread{}
// Java single inheritance yapisina sahiptir

public class _61_Thread2 extends Thread {
	
	@Override
	public void run() {
		
	}
	
	// 2) interface ==> public class MultipleThreadExam implements Runnable
	// javada implementasyon siniri yoktur istedigimiz kadar interfaceyi implemente
	// edebiliriz
	// Implement zorunlu olarak run metodunu ekler
	class Thread2 implements Runnable {
		
		@Override
		public void run() {
			
		}
	}
	
	// 3) Anonymous ==> Metod olarak
	class Thread3Method {
		public void threadMethodu() {
			Thread thread = new Thread(new Runnable() {
				
				@Override
				public void run() {
					
				}
			});
		}
	}
}
