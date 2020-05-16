package com.java.string;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) 
	{
		String str="sjt";
		//System.out.println(str);
		
		String str1="sjt";
		//System.out.println(str1);
        //System.out.println(str==str1);
        
        str=str+"classes"; //creating a new object
       // System.out.println(str==str1);  //creatinging one more object memory inside constatnt pool
        
       // string using new keyword
        
    
       
        String str2=new String("sjt");//reating object memory in heap here both objects are diff..cz diff memory addre
        String str3=new String("sjt");
       // System.out.println(str2==str3);
        
       // System.out.println("equals \t"+str2.equals(str3));
        //System.out.println(str2.intern()==str.intern());
        
        /*Scanner sc=new Scanner(System.in);
        System.out.println("enter sjt");
        String str4=sc.next();
         System.out.println("again enter sjt");
         String str5=sc.next();
         System.out.println(str4);
         System.out.println(str5);
         System.out.println(str4==str5);
*/       
        String st3=new String();
        st3=st3.concat("hello  world");
        //System.out.println(st3);
        //System.out.println(st3.length());
        
        char charr[]={'h','e','l','l','o', 'w','o','r','l','d'};
        byte barr[]={65,66,67,68,69};
        
        //String st4a=new String(charr);
        //System.out.println(st4a);
        
       /* String st4b=new String(charr,2 ,3 );
        System.out.println(st4b);*/

        String st5a=new String(barr);
        System.out.println(st5a);
        
        String st5b=new String(barr,2,3);
        System.out.println(st5b);
        
        
        
	}

}
