package com.reg.multithreading;

import java.util.ArrayList;
import java.util.List;

public class synchronization {
	public static void main(String[] args) {
		List<String> arr1 = new ArrayList<String>();
		Syncro u = new Syncro(arr1);
		Dha d = new Dha(arr1);
		Thread t1 = new Thread(u);
		Thread t2 = new Thread(d);
		t1.start();
		t2.start();

	}

}

class Syncro implements Runnable {
	List<String> arr;

	Syncro(List<String> arr1) {
		this.arr = arr1;
	}

	public void run() {
		for (int i = 10; i < 15; i++) {
			synchronized (arr) {

				arr.add("i");
				System.out.println("add " + i);
			}
		}
	}
}

class Dha implements Runnable {
	List<String> arr;

	Dha(List<String> arr) {
		this.arr = arr;
	}

	public void run() {

		for (int i = 0; i < 5; i++) {

			arr.remove("i");
			System.out.println("remove " + i);

		}
	}
}
