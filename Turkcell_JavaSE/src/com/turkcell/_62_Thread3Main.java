package com.turkcell;

public class _62_Thread3Main {
	
	public static void main(String[] args) throws InterruptedException {
		_62_Thread3Extends thread1 = new _62_Thread3Extends("Thread1 is Running...");
		_62_Thread3Extends thread2 = new _62_Thread3Extends("Thread2 is Running...");
		_62_Thread3Extends thread3 = new _62_Thread3Extends("Thread3 is Running...");
		
		thread1.start();
		// thread2.start();
		// thread3.start();
		
		// öncelikle thread 1 bitmesi gerekiyor 1.thread bittikten sonra digerleri
		// baslar
		thread1.join();
		System.out.println("1.Thread ID " + thread1.getId());
		System.out.println("1.Thread ID " + thread1.getName());
		thread1.setName("Degisti 1");
		System.out.println("1.Thread ID " + thread1.getName());
		System.out.println("******************************************");
		
		thread2.start();
		thread2.wait(); // 2. emre kadar thread 2 dursun
		thread2.notify();
		thread2.notifyAll();
		
		thread3.start();
	}
}
