package ecommerceProject;

public class EncapsulationMain 
{

	public static void main(String[] args) 
	{
		Encapsulation e=new Encapsulation();
		
		e.setAccno(2345);
	    System.out.println(e.getAccno());
	    
	    e.setName("kavya");
	    System.out.println(e.getName());
	    
	    e.setAmount(75342);
	    System.out.println(e.getAmount());
	}

}
