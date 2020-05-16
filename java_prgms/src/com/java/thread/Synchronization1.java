package com.java.thread;

public class Synchronization1 {

	public static void main(String[] args) 
	{
		Hello1 h1=new Hello1();
		Hello1 h2=new Hello1();
		Athread2 th1=new Athread2(h1,7);
		th1.start();
		
		Bthread2 th2=new Bthread2(h1,9);
		th2.start();
		
	}

}


class Hello1 extends Thread
{
	public synchronized void printTable (int num)
	{
		for (int i = 0; i <=10; i++) 
		{
			System.out.println(num +"x" + i +"="+ (num*i));
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
	}
}

class Athread2 extends Thread
{
	Hello1 h;
	int num;
	public Athread2(Hello1 h,int num) 
	{
		this.h=h;
		this.num=num;
	}
	@Override
	public void run()
	{
		h.printTable(num);
	}
}
	
class Bthread2 extends Thread
{
	Hello1 h;
	int num;
	public Bthread2(Hello1 h,int num) 
	{
		this.h=h;
		this.num=num;
	}
	@Override
	public void run()
	{
		h.printTable(num);
	}
}
	

