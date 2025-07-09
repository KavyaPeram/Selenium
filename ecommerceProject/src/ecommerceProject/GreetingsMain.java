package ecommerceProject;

public class GreetingsMain 
{

	public static void main(String[] args) 
	{
		Greetings gr=new Greetings();
		
		gr.m1();
		
		String s=gr.m2();
		System.out.println(s);
		
		gr.m3("kavya");
		
		String s2=gr.m4("pavan");
		System.out.println(s2);
	}

}
