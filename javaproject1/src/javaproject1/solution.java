package javaproject1;
import java.util.*;
import java.util.Map.Entry;


public class solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		HashMap<Integer,String> hm =new HashMap<Integer,String>();
		System.out.println("enter the number and string !!");
		hm.put(1,"abhijeet");
		for(int i=1;i<=5;i++)
		{
			int n=sc.nextInt();
			String s=sc.next();
			hm.put(n,s);
			
		}
//		Iterator<> itr=hm.iterator();
		Set<Map.Entry<Integer, String>> mpa = hm.entrySet();
		
		
		for(Map.Entry<Integer, String> c : mpa)
		{
		System.out.println(c.getKey());
			System.out.println(c.getValue());
		}

		
		
		

	}

}
