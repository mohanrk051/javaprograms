package com.practiceu.prgm;

import java.util.Scanner;

public class Boiling {

	public static void main(String[] args) 
	{   
		System.out.println("give in the temp");
		Scanner sc=new Scanner(System.in);
		int temp=sc.nextInt();
		if (temp>=100) 
		{
			System.out.println("water is boiling");
			
		} else { System.out.println("water is not boiling");

		}

	}

}
