package com.java.coupling;

import java.util.Scanner;



//looslely coupled

public class Test {

	public static void main(String[] args)
	{
		
		Journey trip1=new Journey();
		Scanner sc=new Scanner(System.in);
		System.out.println("enter car for 'C' and bike for 'B' ");
	    char choice=sc.next().charAt(0);
	    Car car=null;
	    
	if (choice=='C')
	{
		trip1.carJourney();
	
	} 
	else if(choice=='B')
	{

		trip1.bikeJourney();
	
		
	}
	}
}


class Journey
{
	Car car=new Car();
	Bike bike=new Bike();

	void carJourney()
	{
		car.move();
		
	}
	void bikeJourney()
	{
		bike.move();
		
	}
}

class Journey1
{
	void startJourney(Vehicle v)
	{
		v.move();
		
	}
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

interface Vehicle
{ 
	void move();
}