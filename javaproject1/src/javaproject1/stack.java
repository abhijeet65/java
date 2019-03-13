package javaproject1;
import java.util.*;


public class stack {

	public static void main(String args[])
	{
			Stack<Integer> s=new Stack<Integer>();
			s.push(1);
			s.push(2);
			s.push(3);
			s.push(4);
			
			int ans=s.pop();
			
			System.out.println("Popped elemnt "+ans);
			
			Vector<Integer> v=new Vector<Integer>(3,5);
			
			v.add(1);
			v.add(2);
			v.add(3);
			
			for(int i=0;i<v.size();i++)
			{
				System.out.println(v);
			}
			
			
			
			
			
	}
}
