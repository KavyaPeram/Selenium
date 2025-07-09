package ecommerceProject;

class Bank
{
	double roi()
	{
		return 3.5;
	}
}

class SBI extends Bank
{
	double roi()
	{
		return 10.5;
	}
}

class ICICI extends Bank
{
	double roi()
	{
		return 9.5;
	}
}

public class Overriding 
{

	public static void main(String[] args) 
	{
		SBI s=new SBI();
		System.out.println(s.roi());
		ICICI ic=new ICICI();
		System.out.println(ic.roi());
	}

}
