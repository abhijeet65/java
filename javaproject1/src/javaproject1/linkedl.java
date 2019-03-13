package javaproject1;
import java.util.*;

public class linkedl {
	
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		LinkedList<Double> ll=new LinkedList<Double>();
		
		
		for(int i=1;i<=6;i++)
		{
			double s=sc.nextDouble();
			ll.add(s);
		}
		
		for(Double d : ll)
		{
			System.out.println(d+" ");
		}
		
		System.out.println("first elemnt"+ll.peekFirst());
		System.out.println("lat elemnt"+ll.peekLast());
		System.out.println("poped elemnt"+ll.removeLast());
		
		
		
		for(Double d : ll)
		{
			System.out.println(d+" ");
		}
		
		Comparator<Double> mycomp=Collections.reverseOrder();
//		Collections.sort(ll);
		
		for(Double f : ll)
		{
			System.out.print(f+" ");
		}
		
		
		
	}

}
