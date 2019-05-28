package com.reg.multithreading;

public class Multithreadingdemo  extends Thread{

		public void run() {

			for (int i = 0; i < 7; i++) {

				System.out.println("multi threading testing...");
				try {
					Thread.sleep(100);
			} catch (Exception e) {
			
				}
			}
		}	
	public static void main(String args[]) {
			Multithreadingdemo obj2 = new Multithreadingdemo();
			obj2.start();

		}

	}

