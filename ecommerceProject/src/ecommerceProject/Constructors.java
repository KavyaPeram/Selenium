package ecommerceProject;

public class Constructors 
{
     int x,y;
     
     //default constructor
     Constructors()
     {
    	 x=10;
    	 y=20;
     }
     
     //parameterized constructor
     Constructors(int a,int b)
     {
    	 x=a;
    	 y=b;
     }
     
     void sum()
     {
    	 System.out.println(x+y);
     }
     
	public static void main(String[] args) 
	{
		Constructors c=new Constructors();
		Constructors cd=new Constructors(30,50);
		c.sum();
	}

}
