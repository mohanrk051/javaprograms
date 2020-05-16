package com.java.thread;


 public class Wait_notify
 {

 public static void main(String[] args) {
	
	AThreaddd th1=new AThreaddd("A-Thread");
	//th1.start();
	
	AThreaddd th2=new AThreaddd("B-Thread");
	//th2.start();
	
	Hello4 h1=new Hello4();
	Hello4 h2=new Hello4();
	BThreaddd th3=new BThreaddd(h1,"C-Thread");
	th3.start();
	
	BThreaddd th4=new BThreaddd(h1,"D-Thread");
	th4.start();
	
	
	try {
		Thread.sleep(2000);
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	
	CThreaddd th5=new CThreaddd(h1,"notify-Thread");
	th5.start();
	
	
	//System.out.println(h1);
	//System.out.println(th1);
}
}




class AThreaddd extends Thread{
	
	AThreaddd(String name){
		super(name);
		
	}
	public synchronized void run() {
		Thread th=Thread.currentThread();
		for (int j = 1; j <=5; j++) {
				try {
					wait(1000);
					//sleep(500);
					System.out.println(th.getName()+"\t"+this);
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		
		
	}
}

class Hello4{
	synchronized void m1(){
		Thread th=Thread.currentThread();
		for (int j = 1; j <=5; j++) {
				System.out.println(th.getName()+" moved to wait..."+"\t"+this);
				try {
					wait();
					//Thread.sleep(500);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
	synchronized void m2(){
		notify();
	}
	
		
	
}



class BThreaddd extends Thread{
	Hello4 h;
	BThreaddd(Hello4 h,String name){
		super(name);
		this.h=h;
	}
	public void run() {
		h.m1();
	}
}


class CThreaddd extends Thread{
	Hello4 h;
	CThreaddd(Hello4 h,String name){
		super(name);
		this.h=h;
	}
	public void run() {
		h.m2();
	}
}

