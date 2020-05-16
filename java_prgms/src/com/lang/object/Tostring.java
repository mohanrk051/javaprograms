package com.lang.object;

class Hello2
{ int id;
  String name;
	
  
	public Hello2(int id, String name) {
	super();
	this.id = id;
	this.name = name;
}


	@Override
	public String toString() 
	{
		System.out.println("toString() overriden");
		return id+"id"+name+"name";
	}
}
public class Tostring {

	public static void main(String[] args) 
	{
		Hello2 h=new Hello2(10,"mk");
		System.out.println("h ref object "+h);
		//System.out.println(h.hashCode());
       
		String  cname=h.getClass().getName();
        System.out.println("cname "+cname);
        
        //converts integer to hexaecimal
     String  hex_hcode =Integer.toHexString(h.hashCode());
     System.out.println("hex decimal "+hex_hcode);
      
     System.out.println(cname+"@"+hex_hcode);
	}

}
