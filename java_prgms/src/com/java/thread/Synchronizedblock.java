package com.java.thread;

import com.sun.org.apache.xalan.internal.xsltc.compiler.sym;

public class Synchronizedblock
{
	public static void main(String[] args)
	{

		Hello3 h1=new Hello3();
		Hello3 h2=new Hello3();
		
		AThreadd th1=new AThreadd(h1,"A-Thread");
		th1.start();
		
		AThreadd th2=new AThreadd(h2,"B-Thread");
		th2.start();

		

	}

}

class Hello3
{
	 void m1()
	{
		Thread th=Thread.currentThread();
		/*for (int i = 0; i < 5; i++) {
			System.out.println("m1()-outside SBlock "+th.getName());
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}*/
		
		
		//Hello3 h11=new Hello3();   //called default object so 
		Hai hai=new Hai();

           synchronized (new Hai())    // 1)this-concurrent 
           {                                //  2) this.getClass()->synchronous     
             for (int j = 1; j <=5; j++)    //h11.getClass()->synchonous
             {                              //Hai.class->synchronous
            	                            //new Hai()->concurrent
                  System.out.println("m1() -inside SBlock "+th.getName());
				  try
				  {
				     Thread.sleep(500);
				  }
                   catch (InterruptedException e) 
                   {
					// TODO Auto-generated catch block
					e.printStackTrace();
                   } //catch
             }//forloop
           }// synchronized block
		
	}  //m1()
} //hello


class AThreadd extends Thread{
	Hello3 h;
	AThreadd(Hello3 h,String name){
		super(name);
		this.h=h;
	}
	public void run() {
		h.m1();
	}
}


class Hai{
	
}