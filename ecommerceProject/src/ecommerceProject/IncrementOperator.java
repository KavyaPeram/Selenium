package ecommerceProject;

public class IncrementOperator 
{

	public static void main(String[] args) 
	{
		
		int a=10;
		System.out.println(a++);
		System.out.println(a);
		System.out.println(a--);
		System.out.println(a);
		System.out.println(++a);
		System.out.println(--a);
		
		//Assignment operators  =  +=  -==  *=  /=  %=
		
		int b=20;
		b+=5;
		System.out.println(b);
		b-=10;
		System.out.println(b);
		b*=15;
		System.out.println(b);
		b/=5;
		System.out.println(b);
		b%=15;
		System.out.println(b);
		
		//Ternary operator  ?:
		
		int x=100;
		int y=200;
		int z=(x>y) ? x : y;
		System.out.println(z);

	}

}
