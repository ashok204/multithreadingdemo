package com.reg.multithreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Excuteservicesingle {
	public static void main(String[] args) {
		
		ExecutorService service = Executors.newSingleThreadExecutor();

		for (int i = 0; i <= 10; i++) {

			service.execute(new CatchDemo("task- " + i));

		}

	}

}

class ExcecuterServicetest2 implements Runnable {

	String task;

	public ExcecuterServicetest2(String t) {
		task = t;
	}

	public void run() {

		System.out.println(task + "     " + Thread.currentThread().getName());

	}

}


