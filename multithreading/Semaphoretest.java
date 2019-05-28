package com.reg.multithreading;

import java.util.concurrent.Semaphore;

public class Semaphoretest implements Runnable {

    static Semaphore sem=new Semaphore(2);

public void run() 
{
try
{
sem.acquire();
for(int i=0;i<20;i++)
{
  System.out.println(Thread.currentThread().getName()+"----------"+i);
    }

} catch (InterruptedException e) {
//TODO Auto-generated catch block
e.printStackTrace();
}
finally
{
sem.release();
}



}

}


