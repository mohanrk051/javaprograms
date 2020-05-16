package com.util.collection;


import java.util.Iterator;
import java.util.LinkedList;

public class Iterator1 {

	public static void main(String[] args) 
	{
		LinkedList<String> animals=new LinkedList<String>();
		animals.add("dog");
		animals.add("tiger");
		animals.add("lion");
		animals.add("elephant");
		animals.add("cat");
		//System.out.println(animals);
		//through for each loop or enhance for loop we want acess all string objects
		
		
  
		System.out.println("====================================");
		System.out.println("iterator");
		//or same we can use iterator 
		  Iterator<String> itr=animals.iterator();
		  String  val=itr.next();
		   
		/*   String val1=itr.next();
		   System.out.println(val1);
		   String val2=itr.next();
		   System.out.println(val2);
		   String val3=itr.next();
		   System.out.println(val3);
		   String val4=itr.next();
		   System.out.println(val4);
		   String val5=itr.next();
		   System.out.println(val5);
		   boolean val=itr.hasNext();
		   System.out.println(val);*/
		  
		 while (itr.hasNext()) {
			String value = itr.next();
			System.out.println(value);
			if (value=="dog")
			{
				itr.remove();
				
			}
			
		}
		 for (String animal : animals)
			{
				System.out.println(animal);
				
			}
		
	
		
	}

}
