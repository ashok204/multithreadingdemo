package com.reg.multithreading;

public class Multithreadtest extends Thread {

	@Override
	public void run() {
		super.run();
		System.out.println("thread is running...");
	}

	public static void main(String args[]) {
		Multithreadtest t1 = new Multithreadtest();
		t1.start();
	}
}
