package ecommerceProject;

interface shape
{
	int length=10; //final & static by default
	int width=20;  //final & static by default
	
	void circle(); //abstract method
	
	default void square() //interface allows abstract,default,static methods
	{
		System.out.println("this is a square - default method");
	}
	
	static void rectangle() //interface allows abstract,default,static methods
	{
		System.out.println("this is a rectangle - static method");
	}
}

public class InterfaceDemo implements shape
{
    public void circle() //methods in interface are public
    {
    	System.out.println("this is a circle - abstract method");
    }
    
    void triangle()
    {
    	System.out.println("this is a triangle");
    }
    
    int x=100,y=200;
	
	public static void main(String[] args) 
	{
		InterfaceDemo id=new InterfaceDemo();
		id.circle(); //abstract
		id.square(); //default
		shape.rectangle(); //static method can directly access from interface
		id.triangle();
		System.out.println(id.x+id.y);
		
		shape s=new InterfaceDemo();
		s.circle();
		s.square();
		shape.rectangle();
		/*s.triangle(); can't access because triangle is a class method not interface method 
		                and object is created for interface not for class  */
		
		System.out.println(shape.length * shape.width); //accessing static variables directly
		
		/*System.out.println(s.x+s.y); can't access because x,y are class variables not interface variables 
                                         and object is created for interface not for class  */

	}

}
