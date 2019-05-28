package com.reg.multithreading;

import java.util.ArrayList;
import java.util.List;

public class Producermain {
	public static void main(String args[]) {
		List<Integer> arr = new ArrayList<>();
		Thread p = new Thread(new Producer(arr));
		Thread c = new Thread(new Consumer(arr));
		p.start();
		c.start();
	}

}
