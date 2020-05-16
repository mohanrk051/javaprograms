package com.java.interface1;

import java.util.Scanner;

interface Shape
{
	void draw();
}
class Circle implements Shape
{
	public void draw()
	{
		System.out.println("circle draw");
	}
}
class Triangle extends Circle
{
	public void draw()
	{
		System.out.println("Triangle draw");
	}
}
public class Test2 {

	public static void main(String[] args) 
	{
		/*Shape s=new Circle();
		s.draw();
		
		Shape s1=new Triangle();
		s1.draw();*/
		
		/*Circle c=new Circle();
		c.draw();
		
		Triangle t =new Triangle();
		t.draw();*/
		/*Circle c=new Triangle();
		c.draw();*/
		
		Shape shape=null;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter your option A or B");
		char opt=sc.next().charAt(0);
		
		if (opt=='A')
		{
			shape=new Circle();
		
		} 
		else if(opt=='B')
		{

			shape=new Triangle();
		
			
		}

		shape.draw();
	}

}
