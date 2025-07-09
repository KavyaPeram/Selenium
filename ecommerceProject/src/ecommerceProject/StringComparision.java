package ecommerceProject;

public class StringComparision
{

	public static void main(String[] args) 
	{
		//case 1
		String s1="welcome";
		String s2="welcome";
		System.out.println(s1==s2);
        System.out.println(s1.equals(s2));
        
        //case 2
        String s3=new String("java");
        String s4=new String("java");
        System.out.println(s3==s4); //compares objects
        System.out.println(s3.equals(s4)); //compares values of objects
        
        //case 3
        String s5="abc";
        String s6=new String("abc");
        System.out.println(s5==s6);
        System.out.println(s5.equals(s6));
        
        //case 4
        String s7="abc";
        String s8=new String("abc");
        String s9=s8;
        
        System.out.println(s7==s8);
        System.out.println(s7.equals(s8));
        
        System.out.println(s8==s9);
        System.out.println(s8.equals(s9));
        
        System.out.println(s7==s9);
        System.out.println(s7.equals(s9));

	}

}
