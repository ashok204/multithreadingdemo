package com.reg.multithreading;

public class Semaphoremain {

    public static void main(String []args)
    {
  for(int i=0;i<20;i++)
  {
	  Semaphoretest s=new Semaphoretest();
  Thread t=new Thread(s);
  t.start();
  }
    }
}

