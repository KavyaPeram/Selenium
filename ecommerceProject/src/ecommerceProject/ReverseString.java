package ecommerceProject;

public class ReverseString 
{

	public static void main(String[] args) 
	{
		
		//method 1
		String s1="welcome";
		String rev="";
		for(int i=s1.length()-1;i>=0;i--)
		{
			rev=rev+s1.charAt(i);
		}
		System.out.println("reverse of string is :" +rev);
		
		//method 2 - without using strings
		String s2="welcome";
		String reve="";
		char a[]=s2.toCharArray();
		for(int i=a.length-1;i>=0;i--)
		{
			reve=reve+a[i];
		}
		System.out.println("reverse of string is :" +reve);
		
		//method 3
		StringBuffer s3=new StringBuffer("welcome");
		System.out.println("reverse of string is :" +s3.reverse());
		
		//method 4
		StringBuilder s4=new StringBuilder("welcome");
		System.out.println("reverse of string is :" +s4.reverse());
	}

}
