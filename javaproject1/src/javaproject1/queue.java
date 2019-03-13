package javaproject1;
import java.util.*;

public class queue {

	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		
		ArrayDeque<Integer> q=new ArrayDeque<Integer>();
		System.out.println("Enter the number of elemts to insert to queue");
		int n=sc.nextInt();
		for(int i=1;i<=n;i++)
		{
			q.push(sc.nextInt());
			
		}
//		q.pop();
//		for(Integer s : q)
//		{
//			System.out.println(s+" ");
//		}
		
//		q.addFirst(98);
//		q.addLast(1000);
//		System.out.println(q.peekFirst());
//		System.out.println(q.pollLast());
		
		while(q.peek()!=null)
		{
			System.out.println(q.pop()+" ");
		}
		
			
	}
}
