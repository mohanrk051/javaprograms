

package com.java.thread;

class Athread extends Thread
{
	public void run() 
	{
		Thread t=Thread.currentThread();
		ThreadGroup tg=t.getThreadGroup();
		for (int i = 0; i < 5; i++) 
		{
			System.out.println("i value "+i+"ThreadId:+ "+t.getId()+"ThreadName:+ "+t.getName()+"ThreadGroup:+ "+tg.getName());
			
		}
		System.out.println("run()");
		
	}
	
}

class Bthread extends Thread
{
	public void run() 
	{
		Thread t=Thread.currentThread();
		ThreadGroup tg=t.getThreadGroup();
		for (int i = 0; i < 5; i++) 
		{
			System.out.println("ThreadId:+ "+t.getId()+"ThreadName:+ "+t.getName()+"ThreadGroup:+ "+tg.getName());
			
		}
		System.out.println("run()");
		
	}
	
}
public class CustomThread_Extend {

	public static void main(String[] args) 
	{
		System.out.println("main()- starts");
		System.out.println("AThread created");
		Athread ath= new Athread();
		Bthread bth= new Bthread();
		ath.start();
	
		//ath.setName("Athread");
		//ath.start();
		//ath.run();
		//bth.setName("Bthread");
		bth.start();
		//Athread ath1= new Athread();
		//ath1.start();
		//ath1.run();

	}

}
