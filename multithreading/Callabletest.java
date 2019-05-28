package com.reg.multithreading;

import java.util.concurrent.Callable;

public class Callabletest implements Callable {
	int a,b,c;
	Callabletest(int a,int b){
		this.a=a;
		this.b=b;
	}
	@Override
	public Object call() throws Exception {
		 c=a+b;
		 System.out.println(Thread.currentThread().getName());
		 return c;
	
	}

}
