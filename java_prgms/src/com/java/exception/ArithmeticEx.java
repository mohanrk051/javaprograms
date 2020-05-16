package com.java.exception;

public class ArithmeticEx 

	{
		   public static void main(String args[]) 
		   {
		      try{
		         int num1=20,num2=0;
		         int output=num1/num2;
		         System.out.println ("Result: "+output);
		      }
		      
		      catch(ArithmeticException e)
		      {
		    	  System.out.println("you should not divide number  by zero");
		    	  
		      }
		   }
		}



