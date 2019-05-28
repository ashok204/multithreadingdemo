package com.reg.multithreading;

import java.util.List;

public class Producer implements Runnable{
	List<Integer>arr;
	Producer(List arr){
		this.arr=arr;
	}

	@Override
	public void run() {
synchronized (arr) {
	
 for(int i=0;i<5;i++) {
		
		if(arr.size()==3) {
		try {
			arr.wait();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
			
	}

else {
			arr.add(i);
			System.out.println("print the producer values"+i);
		arr.notify();
	}
 }
}		

}
}