package com.reg.multithreading;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Callabletestmain {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		Callabletest c=new Callabletest(10, 20);
		Callabletest c1=new Callabletest(30, 40);
		Callabletest c2=new Callabletest(100, 600);
		ExecutorService p=Executors.newFixedThreadPool(10);
		Future<Integer>f1=p.submit(c);
		System.out.println(f1.get());
		Future<Integer>f2=p.submit(c1);
		System.out.println(f2.get());
		Future<Integer>f3=p.submit(c2);
		System.out.println(f3.get());

		

	}

}
