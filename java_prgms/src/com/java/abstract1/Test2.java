package com.java.abstract1;

 abstract class shape
{
	 abstract void draw();
}
  abstract class Circle extends shape
 {
	 void draw()
	 {
		 System.out.println("cirlce is draw");
	 }
	abstract void disp();
 }
 class Triangle extends shape
 {
	 void draw()
	 {
		 System.out.println("triangle-draw");
	 }
 }
 class Square extends Circle
 {
	 void disp()
	 {
		 System.out.println("display()- circle implements");
	 }
 }
public class Test2 {

	public static void main(String[] args)
	{
		//shape s=new Circle();
		//s.draw();
		Circle c=new Square();
		c.disp();
	
		shape s1=new Triangle();
		s1.draw();
		

	}

}
