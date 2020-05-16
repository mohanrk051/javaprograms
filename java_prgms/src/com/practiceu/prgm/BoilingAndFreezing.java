package com.practiceu.prgm;

import java.util.Scanner;

public class BoilingAndFreezing {

	public static void main(String[] args) 
	{   
		System.out.println("give the temparature");
		Scanner sc=new Scanner(System.in);
		int temp=sc.nextInt();
		if (temp>=100) 
		{
			System.out.println("water is boiling");
			
		} else if(temp<=0)
		{
			System.out.println("water is freezing");
		}
		else
			
		{
			System.out.println("water is normal");
		}
	}
			
			

		

	

}
