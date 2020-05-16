package com.java.thread;

class Athread1 implements Runnable
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


public class CustomeThread_Runnable {

	public static void main(String[] args) 
	{
		System.out.println("main()- starts");
		System.out.println("AThread1 created");
		Athread1 ath= new Athread1();
	//	ath.start(); not available srart() in runnable 
		 
		Thread t=new Thread(ath);
		t.start();
		//t.run();
		
		Thread t2=new Thread(ath);
		t2.start();
		//t2.run();

	}

}
