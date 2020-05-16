package com.java.thread;

class Thread2 extends Thread
{
	public void run() 
	{
		    Thread t=Thread.currentThread();
			System.out.println("ID "+t.getId());
			System.out.println("thread name "+t.getName());
			System.out.println("prority "+t.getPriority());
			
		
	}
	
}
public class ThreadPriority {

	public static void main(String[] args) 
	{
		Thread2 t=new Thread2();
		t.setPriority(06);
		t.start();

	}

}
