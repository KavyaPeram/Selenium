package ecommerceProject;

public class MethodOverloading 
{
   int a=10, b=20;
   void sum()
   {
	   System.out.println(a+b);
   }
   
   void sum(int x,int y) 
   {
      System.out.println(x+y);
   }
   
   void sum(int x,double y) 
   {
      System.out.println(x+y);
   } 
   
   void sum(double x,int y) 
   {
      System.out.println(x+y);
   }
    
   void sum(double x,int y,double z)
   {
	  System.out.println(x+y+z); 
   }
}
