package com.java.thread;

public class Synchronization {

	public static void main(String[] args) 
	{
		Accounts acc=new Accounts();
		WithdrawThread wth=new WithdrawThread(acc);
		DepositeThread dth=new DepositeThread(acc);
		wth.start();
		dth.start();

	}

}

class Accounts
{
	int balance=5000;
	void withDraw( int amount)
	{
		System.out.println("going to withdraw amount " +amount);
		balance-=amount;
		System.out.println("withdraw completes sucessfully");
		System.out.println("remaining balance "+ balance);
	}
	
	void deposite(int amount)
	{
		System.out.println("going to deposite amount "+ amount);
		balance+=amount;
		System.out.println("deposite compltes sucessfully");
		System.out.println("remaing balance "+balance);
		
	}
}

class DepositeThread extends Thread
{
	Accounts acc;

	public DepositeThread(Accounts acc) {
		super();
		this.acc = acc;
	}
	public void run() 
	{
		acc.deposite(500);
		
	}
	
}

class WithdrawThread extends Thread
{
	Accounts acc;

	public WithdrawThread(Accounts acc) {
		super();
		this.acc = acc;
	}

	public void run() 
	{
			acc.withDraw(6000);
	}
	
}
