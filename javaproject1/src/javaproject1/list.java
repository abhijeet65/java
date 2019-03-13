package javaproject1;
import java.util.*;
import java.util.Comparator;

public class list {

	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no of elements");
		int n=sc.nextInt();
		ArrayList<String> al=new ArrayList<String>();
		for(int i=1;i<=n;i++)
		{
			String s=sc.next();
			al.add(s);
			
		}
		for(String s:al)
		{
			System.out.print(s+"  ");
		}
		Collections.sort(al,new comparator());
		
		Comparator mc =new mycomp(); 
		
		Collections.sort(al,mc.reversed());
		
		int i=1;
		for(String e : al)
		{
			System.out.println(i++ +" string is "+e);
		}
		
		
	}
}
