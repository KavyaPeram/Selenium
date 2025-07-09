package ecommerceProject;

public class Strings {

	public static void main(String[] args) 
	{
		//length
		String s="hello";
		String t=new String("");
		System.out.println(s.length());	
		System.out.println(t);
		
		//concatenation
		String s1="welcome";
		String s2="to java";
		String s3=" automation";
		System.out.println(s1+s2);
		System.out.println(s1.concat(s2));
		System.out.println(s1.concat(s2).concat(s3));
		
		//trim
		String s4="   string   ";
		System.out.println(s4);
		System.out.println(s4.trim());
		
		//charat()
		s="welcome";
	    System.out.println(s.charAt(4));
	    System.out.println(s.charAt(2));
	    
	    //contains()
        System.out.println(s.contains("wel"));
        System.out.println(s.contains(s2));
        System.out.println(s.contains("COME"));
        System.out.println(s.contains("welme"));
        
        //equals() equalsIgnoreCase() - compare strings
        String s5="kavya";
        String s6="Kavya";
        System.out.println(s5==s6);
        System.out.println(s5.equals(s6));
        System.out.println(s5.equalsIgnoreCase(s6));
        
        //replace() - single or multiple characters
        s="welcome to java and selenium";
        System.out.println(s.replace('e', 'x'));
        System.out.println(s.replace("selenium", "sql"));
        
        //substring()
        s="Selenium";
        System.out.println(s.substring(1,5));
        
        //upper case,lower case
        System.out.println(s.toUpperCase());
        System.out.println(s.toLowerCase());
        
        //split()
        s="abc@gmail.com";
        String x[]=s.split("@");
        System.out.println(x[0]);
        System.out.println(x[1]);
	}

}
