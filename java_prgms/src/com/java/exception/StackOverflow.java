package com.java.exception;

public class StackOverflow {

	public static void main(String[] args)
	{
        try
        {
        	main(args);
			
		} catch (StackOverflowError e)
		{
			System.out.println("don't call main method with argument inside main() its become recursive");
		}
	      
	}

}
