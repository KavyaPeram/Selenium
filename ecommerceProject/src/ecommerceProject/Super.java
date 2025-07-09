package ecommerceProject;

public class Super
{
   String color="white";
   
   void shape()
   {
	   System.out.println("hexagon");
   }
}

class Unicorn extends Super
{
	String color="rainbow";
	
	void displayColor()
	{
		System.out.println(super.color);
	}
	void shape()
	{
		System.out.println("triangle");
		super.shape();
	}
}
