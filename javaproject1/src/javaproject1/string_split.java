package javaproject1;
import java.util.*;

public class string_split {
	
	public static void main(String args[])
	{
		
		String s = "abhijeet saraf danish shyam krestre colt golu";
		
		StringTokenizer st= new StringTokenizer(s," ");
		
		while(st.hasMoreTokens())
		{
			String ans = st.nextToken();
			
			System.out.println(ans);
			
		}
		
	}

}
