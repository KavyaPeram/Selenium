package ecommerceProject;

public class BreakandContinue 
{

	public static void main(String[] args) 
	{
		/*for(int i=1;i<=10;i++)
		{
			if(i==5)
			{
				break;
			}
			System.out.println(i);
		}*/
		
		for(int i=1;i<=10;i++)
		{
			if(i==3 || i==7 || i==10)
			{
				continue;
			}
			System.out.println(i);
		}
	}

}
