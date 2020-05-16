package com.java.thread;

public class Test {

	public static void main(String[] args)
	{
		System.out.println("main test starts");
		Thread t=Thread.currentThread();
		ThreadGroup tg=t.getThreadGroup();
		System.out.println("thread id:"+t.getId());
		System.out.println("thread name:"+t.getName());
		System.out.println("thread Group name:"+tg.getName());
		Hello h1=new Hello();
		//h1.finalize();
		h1=null;
		System.gc();
		System.out.println("main test ends");

	}
}
	class Hello 
	{
		protected void finalize() 
		{   
			System.out.println("finalize in hello start");
			Thread t=Thread.currentThread();
			ThreadGroup tg=t.getThreadGroup();
			System.out.println("thread id:"+t.getId());
			System.out.println("thread name:"+t.getName());
			System.out.println("thread Group name:"+tg.getName());
			System.out.println("finalize in hello end");
			
		}
	}


