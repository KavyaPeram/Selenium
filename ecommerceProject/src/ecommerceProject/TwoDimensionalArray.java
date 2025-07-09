package ecommerceProject;

public class TwoDimensionalArray
{

	public static void main(String[] args) 
	{
		int a[][]= { {100,200},
				     {300,400},
				     {500,600}
		           };
		//find size of an array
		System.out.println("length of rows:"+a.length);
		System.out.println("length of columns:"+a[0].length);
		
		//read single value from an array
		//System.out.println(a[2][0]);
		
		for(int r=0;r<=2;r++)
		{
			for(int c=0;c<=1;c++)
			{
				System.out.println(a[r][c]+"  ");
			}
			System.out.println();
		}
	}

}
