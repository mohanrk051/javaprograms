package com.java.thread;


class Thread1 extends Thread
{
	Thread1(){}
	Thread1(String name)
	{
		super(name);
		
	}
	
	Thread1(ThreadGroup tg,String name)
	{
		super(tg,name);
	}
	public void run()
	{
	Thread t=Thread.currentThread();
	ThreadGroup tg=t.getThreadGroup();
	for (int i = 0; i < 5; i++) 
	{
		System.out.println("i value "+i+"ThreadId:+ "+t.getId()+"ThreadName:+ "+t.getName()+"ThreadGroup:+ "+tg.getName());
		
	}
	}
}

	
public class Custom_ThreadName_without_setName {

	public static void main(String[] args)
	{
		Thread1 th1=new Thread1();
		th1.setName("AThread");
		Thread1 th2=new Thread1("BThread");
		Thread1 th3=new Thread1("CThread");
		
		ThreadGroup tg=new ThreadGroup("sjt");
		Thread1 th4=new Thread1(tg,"Dthread");
		th1.start();
		th2.start();
		th3.start();
		th4.start();
		
		

	}

}
