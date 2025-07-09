package ecommerceProject;

public class StaticMain 
{

	public static void main(String[] args)
	{
		System.out.println(Static.a);
		Static.m1();
		
		Static s=new Static();
		System.out.println(s.b);
		s.m2();
		
		s.m();
	}

}
