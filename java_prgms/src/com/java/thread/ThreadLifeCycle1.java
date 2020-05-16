package com.java.thread;

class A extends Thread
{
	public void run()
	{
		for (int i = 0; i < 1000; i++)
		{
			System.out.println(i);
			
		}
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}

public class ThreadLifeCycle1
{
	public static void main(String[] args)
	{
	
		A a=new A();
		System.out.println("1: "+a.getState());
		a.start();
		System.out.println("2: " + a.getState());
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e)
		{
		      System.out.println(e);
		}
		System.out.println("3: "+a.getState());
	}
}