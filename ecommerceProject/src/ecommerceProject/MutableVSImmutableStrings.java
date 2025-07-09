package ecommerceProject;

import java.util.Arrays;

public class MutableVSImmutableStrings
{

	public static void main(String[] args) 
	{
		//mutable - can change
		int a[]= {20,50,40,10,30};
		System.out.println(Arrays.toString(a));
		Arrays.sort(a);
		System.out.println(Arrays.toString(a));

		//immutable - can't change
		String s=new String("welcome");
		System.out.println(s);
		String concatstring=s.concat(" to java");
		System.out.println(s);
		System.out.println(concatstring);
	}

}
