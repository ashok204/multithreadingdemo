package com.reg.multithreading;

public class Lockmain {
	 public static void main(String []args)
	    {
	    Locktest l=new Locktest();
	    l.start();
	    Locktest l1=new Locktest();
	    l1.start();
	    for(int i=0;i<10;i++)
	    {
	    	Locktest l2=new Locktest();
	      l2.start();
	    }
	    }
	}


