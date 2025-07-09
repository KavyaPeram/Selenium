package ecommerceProject;

public class Static 
{
   static int a=10;
   int b=20;
   
   static void m1()
   {
	  System.out.println("this is m1 static method"); 
   }
   
   void m2()
   {
	   System.out.println("this is non-static m2 method");
   }
   
   void m()
   {
	   System.out.println(a);
	   System.out.println(b);
	   m1();
	   m2();
   }
}
