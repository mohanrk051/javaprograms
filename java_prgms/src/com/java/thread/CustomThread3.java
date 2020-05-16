package com.java.thread;



class Myapp
{
	 void download()
	{
		 System.out.println("download- complted");
		
	}
	
	 void sendMail()
	{
		 System.out.println("sendMaail- sent sucessfully");
	}
}


class Download extends Thread
{
	public void run() 
	{
		 Myapp m=new Myapp();
		 m.download();
	}
	
}

class Sendmail extends Thread
{
	public void run() 
	{
		 Myapp m=new Myapp();
		 m.sendMail();
	}
	
}


public class CustomThread3 {

	public static void main(String[] args) 
	{
		Download d1=new Download();
		d1.start();
		Sendmail s1=new Sendmail();
		s1.start();

	}

}
