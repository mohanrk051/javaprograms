package com.java.thread;

public class Synchronization2 {

	public static void main(String[] args) {
		
		Hello2 h1=new Hello2(); 
		Hello2 h2=new Hello2();
		                                      // both are instance method 
		//AThread th1=new AThread(h1,"T1");  /*   h1, h1->concurrent same object  
		                                        //h1,h2 ->concurrent   diff object                                */
		
		AThread th2=new AThread(h1,"T2");
		                                         // instcance m1 & static m3 =h1,h1--> h1,h2->concurrent
		//th1.start();
		//th2.start();
		                                       // one instcane method and one synchronized method 
		BThread th3=new BThread(h1,"T3");     //h1,h1  --> h1,h2->concurrent
		//th3.start();                            
		//BThread th4=new BThread(h1,"T4");   // here both synchr() h1,h1->syncronous  but h1,h2->concurrent
		//th4.start();
		
		CThread th5=new CThread(h1,"T5");  //one instance m1 and static m3  =h1,h1->h1,h2->concurrent
		
		th5.start();                  // synchronous m2 & static m3 == h1,h1->h1,h2->concurrent 
		
		
		/*CThread th6=new CThread(h2,"T6");                              
		th6.start();  */                         
		                                         
		DThread th7=new DThread(h1,"T7");  // static synchronize m4 and synchrnize m2()--h1,h1-> h1,h2->concurrent
		th7.start();
//		                                    //both static synchronous h1,h1->syncrnous h1,h2->synhronous
		DThread th8=new DThread(h1,"T8");    //static method m3() with static synchronize m4() h1,h2->h1,h1_>concurrent
		//.start();
		
		
	}
	}


	class Hello2{
		void m1(){
			for (int j = 1; j <=5; j++) {
				System.out.println("m1() - Hello2 instance method  "+Thread.currentThread().getName());
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		
		synchronized void m2(){
			for (int j = 1; j <=5; j++) {
				System.out.println("m2() -Hello2 Synchronized "+Thread.currentThread().getName());
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		
		static void m3(){
			for (int j = 1; j <=5; j++) {
				System.out.println("m3() -Hello2 static "+Thread.currentThread().getName());
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		
		synchronized static void m4(){
			for (int j = 1; j <=5; j++) {
				System.out.println("m4()-Hello2 synchronised static "+Thread.currentThread().getName());
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}

	class AThread extends Thread{
		Hello2 h;
		AThread(Hello2 h,String name){
			super(name);
			this.h=h;
		}
		public void run() {
			h.m1();
		}
	}

	class BThread extends Thread{
		Hello2 h;
		BThread(Hello2 h,String name){
			super(name);
			this.h=h;
		}
		public void run() {
			h.m2();
		}
	}

	class CThread extends Thread{
		Hello2 h;
		CThread(Hello2 h,String name){
			super(name);
			this.h=h;
		}
		public void run() {
			h.m3();
		}
	}

	class DThread extends Thread{
		Hello2 h;
		DThread(Hello2 h,String name){
			super(name);
			this.h=h;
		}
		public void run() {
			h.m4();
		}
	}
