package javaproject1;
import java.util.*;

public class dictionarypProg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Hashtable<String,Integer> ht = new Hashtable<String,Integer>();
		
		ht.put("Abhijeet",623);
		ht.put("Ankit", 545);
		ht.put("Vishrut", 120);
		ht.put("Shyam",100);
	
		Enumeration<String> names;
		names=ht.keys();
		
		while(names.hasMoreElements())
		{
			String str=names.nextElement();
			System.out.println(str+ " has value "+ht.get(str));
		}
		
		
		Set<String> st = ht.keySet();
		System.out.println("----------------------------");
		for(String s : st)
		{
			System.out.print(s+" ");
		}
		System.out.println();
		System.out.println("----------------------------");
		for(String s : st)
		{
			System.out.print(ht.get(s)+" ");
		}
		
		

	}

}
