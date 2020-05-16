package com.java.coupling;


public class Test1 {

	public static void main(String[] args)
	{
		
	Journey2 trip1=new Journey2();
        Car1 car=new Car1();
        Bike1 bike =new Bike1();
        trip1.startJourney(car);
        trip1.startJourney(bike);
	}
}




class Journey2
{
	void startJourney(Vehicle1 v)
	{
		v.move();
		
	}
}

class Car1 implements Vehicle1
{
	public void move()
	{
		System.out.println("car moving");
	}
	
}

class Bike1 implements Vehicle1
{
	public void move()
	{
		System.out.println("bike moving");
	}
	
}

interface Vehicle1
{ 
	void move();
}