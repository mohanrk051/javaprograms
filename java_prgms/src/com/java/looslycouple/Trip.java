package com.java.looslycouple;

import java.util.Scanner;


interface Vehicle
{
	void move();
}
class Car implements Vehicle
{
	public void move()
	{
		System.out.println("car moving");
	}
}
class Bike implements Vehicle
{
	public void move()
	{
	System.out.println("bike moving");
	}
}

class Journey
{
	void startJourney(Vehicle v)
	{
		v.move();
	}
}
public class Trip {

	public static void main(String[] args)
	{
		Journey j=new Journey();
		Vehicle v=null;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter option if you want to ride car press 'C' else Bike 'b'");
		char opt=sc.next().charAt(0);
	
        if (opt=='C')
        {
        	v=new Car();
        	System.out.println("v car"+v);
			
		} 
        else if(opt=='B')
        {
			v=new Bike();
        }

		 j.startJourney(v);
	}

}
