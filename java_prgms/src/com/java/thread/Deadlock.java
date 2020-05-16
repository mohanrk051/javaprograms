package com.java.thread;

public class Deadlock 
{

	public static void main(String[] args) {
		
		String resource1="Resource-1";
		String resource2="Resource-2";
		
		Hello5 h1=new Hello5(resource1,resource2);
		Hello5 h2=new Hello5();
		
		T1 t1=new T1(h2);
		T2 t2=new T2(h2);
		
		t1.start();
		t2.start();
		
		
		/*String resource1 = "ratan jaiswal";  
	    String resource2 = "vimal jaiswal";  
	    // t1 tries to lock resource1 then resource2  
	    Thread t1 = new Thread() {  
	      public void run() {  
	          synchronized (resource1) {  
	           System.out.println("Thread 1: locked resource 1");  
	  
	           try { Thread.sleep(100);} catch (Exception e) {}  
	  
	           synchronized (resource2) {  
	            System.out.println("Thread 1: locked resource 2");  
	           }  
	         }  
	      }  
	    };  
	  
	    // t2 tries to lock resource2 then resource1  
	    Thread t2 = new Thread() {  
	      public void run() {  
	        synchronized (resource2) {  
	          System.out.println("Thread 2: locked resource 2");  
	  
	          try { Thread.sleep(100);} catch (Exception e) {}  
	  
	          synchronized (resource1) {  
	            System.out.println("Thread 2: locked resource 1");  
	          }  
	        }  
	      }  
	    };  
	  
	      
	    t1.start();  
	    t2.start();  
		*/
		
	}
	}


	class Hello5{
		
		String resource1="Resource-1";
		String resource2="Resource-2";
		Hello5(){}
		
		public Hello5(String resource1, String resource2) {
			this.resource1 = resource1;
			this.resource2 = resource2;
		}

		void m1(){
			Thread th=Thread.currentThread();
			synchronized (resource1) {
				System.out.println(th.getName()+" locked "+resource1);
				System.out.println("waiting for"+resource2);
				try {
					Thread.sleep(500);
				} catch (Exception e) {
					// TODO: handle exception
				}
				synchronized (resource2) {
					System.out.println(th.getName()+" Released "+resource2);
				}
			}
		}
		
		void m2(){
			Thread th=Thread.currentThread();
			synchronized (resource1) {
				System.out.println(th.getName()+" locked "+resource1);
				System.out.println("waiting for"+resource1);
				try {
					Thread.sleep(500);
				} catch (Exception e) {
					// TODO: handle exception
				}
				synchronized (resource2) {
					System.out.println(th.getName()+" Released "+resource2);
				}
			}
		}
		
	}

	class T1 extends Thread{
		Hello5 h1;
		T1(Hello5 h1){
			this.h1=h1;
		}
		
		public void run() {
			h1.m1();
		}
	}

	class T2 extends Thread{
		Hello5 h1;
		T2(Hello5 h1){
			this.h1=h1;
		}
		
		public void run() {
			h1.m2();
		}
	}