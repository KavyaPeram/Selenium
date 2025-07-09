package ecommerceProject;

public class ConstructorOverloadingMain 
{

	public static void main(String[] args) 
	{
		ConstructorOverloading col1=new ConstructorOverloading();
		 
		ConstructorOverloading col2=new ConstructorOverloading(15.5,20.5,10.5);
		
		ConstructorOverloading col3=new ConstructorOverloading(30.5);
		
		System.out.println(col1.volume());
		System.out.println(col2.volume());
		System.out.println(col3.volume());
	}

}
