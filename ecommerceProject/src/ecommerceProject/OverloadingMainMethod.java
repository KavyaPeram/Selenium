package ecommerceProject;

public class OverloadingMainMethod
{
	
	void main(int x)
	{
		System.out.println(x);
	}
	
	void main (String s)
	{
		System.out.println(s);
	}
	
	void main(String g,double d)
	{
		System.out.println(g+d);
	}

	public static void main(String[] args) 
	{
		OverloadingMainMethod om=new OverloadingMainMethod();
		om.main(40);
		om.main("naveen");
		om.main("pavan", 10);
		
	}

}
