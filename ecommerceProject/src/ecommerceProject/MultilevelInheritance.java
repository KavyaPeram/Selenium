package ecommerceProject;

class C
{
	int c;
	void display()
	{
		System.out.println(c);
	}
}

class D extends C
{
	int d;
	void show()
	{
		System.out.println(d);
	}
}

class E extends D
{
	int e;
	void print()
	{
		System.out.println(c);
	}
}

public class MultilevelInheritance 
{

	public static void main(String[] args) 
	{
		E eobj=new E();
		eobj.c=300;
		eobj.d=400;
		eobj.e=500;
		eobj.display();
		eobj.show();
		eobj.print();
	}

}
