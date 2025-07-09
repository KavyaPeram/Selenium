package ecommerceProject;

public class Operators 
{

	public static void main(String[] args) 
	{
		//Arithmetic operators   + - * / %
		
		int a = 10; 
		int b = 20;
		
		System.out.println(a+b);
		System.out.println(a-b);
		System.out.println(a*b);
		System.out.println(a/b);
		System.out.println(a%b);
		
		//Relational operators   > >= < <= == !=
		
		System.out.println(a>b);
		System.out.println(a>=b);
		System.out.println(a<b);
		System.out.println(a<=b);
		System.out.println(a==b);
		System.out.println(a!=b);
		
		//Logical operators   && || !
		boolean x=true;
		boolean y=false;
		
		System.out.println(x&&y);
		System.out.println(x||y);
		System.out.println(!x);
		System.out.println(!y);
		
		boolean b1=10>20;
		System.out.println(b1); //false
		boolean b2=20>10;
		System.out.println(b2); //true
		
		System.out.println(b1&&b2); //false
	    System.out.println(b1||b2); //true	
		
		
		
	}

}
