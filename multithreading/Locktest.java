package com.reg.multithreading;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;


public class Locktest  extends Thread{
	//public class LockEx extends Thread
	//{
	    static Lock l=new ReentrantLock();
	    public void run()
	    {     
	    lockdemo();
	    }
	    void lockdemo()
	    {
	    l.lock();
	    for(int i=0;i<20;i++)
	    {
	    System.out.println(Thread.currentThread().getName()+"----------"+i);
	    }
	    l.unlock();
	    }
	    
	}

