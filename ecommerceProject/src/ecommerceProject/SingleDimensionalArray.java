package ecommerceProject;

public class SingleDimensionalArray 
{

	public static void main(String[] args) 
	{
		//Approach 1
		/*int a[]=new int[5];
		a[0]=100;
		a[1]=200;
		a[2]=300;
		a[3]=400;
		a[4]=500;
		System.out.println(a);*/
		
		//Approach 2
		int a[]= {10,20,30,40,50};
		
		//find length of an array
		System.out.println("length of an array :" +a.length);
		
		//read single value from an array
		System.out.println(a[3]);
		
		//reading all the values from an array
		/*for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}*/
		
		for(int x:a)
		{
			System.out.println(x);
		}
	}

}
