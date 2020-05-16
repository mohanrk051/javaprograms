package com.util.collection;

import java.util.*;

public class Hashset1 {

	public static void main(String[] args)
	{
		HashSet hs1=new HashSet();
		hs1.add("siddu");
		hs1.add("raju");
		hs1.add("mohan");
		hs1.add("yash");
		hs1.add("kavya");
		hs1.add("kavya");
		hs1.add(11.33);
		hs1.add(false);
		hs1.add(null);
		System.out.println(hs1.size());  //its allow heterogeneous values 
		//System.out.println(hs1);
        
		//hashset not maintained index notation cz its sorted based on hashcode
		hs1.remove(1);
		System.out.println(hs1);  
		
		Iterator itr=hs1.iterator();
		while (itr.hasNext()) {
			Object obj = (Object) itr.next();
			System.out.println(obj);
		}
	
	}

}
