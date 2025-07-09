package ecommerceProject;

public class ThisKeyword 
{
	int x,y;
	
	ThisKeyword(int x,int y)
	{
		this.x=x;
		this.y=y;
	}
	
	void setData(int x,int y)
	{
		this.x=x;
		this.y=y;
	}
	
	void dispaly()
	{
		System.out.println(x);
		System.out.println(y); 
	}

	public static void main(String[] args) 
	{
		ThisKeyword tk=new ThisKeyword(30,40);
		tk.setData(100, 200);
		tk.dispaly();
	}
	
}
