package ecommerceProject;

public class MethodOverloadingMain
{

	public static void main(String[] args)
	{
		MethodOverloading mol=new MethodOverloading();
		mol.sum();
		
		mol.sum(30, 50);
		
		mol.sum(60, 40.5);
		
		mol.sum(70.5, 80);
		
		mol.sum(100.0, 25, 75.5);
	}

}
