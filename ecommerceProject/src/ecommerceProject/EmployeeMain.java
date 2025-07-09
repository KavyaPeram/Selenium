package ecommerceProject;

public class EmployeeMain
{
    public static void main(String[] args) 
	{
    	Employee emp1=new Employee();
		emp1.eid=101;
		emp1.ename="kavya";
		emp1.job="manager";
		emp1.sal=200000;
		emp1.display();
		
		Employee emp2=new Employee();
		emp2.eid=102;
		emp2.ename="pavan";
		emp2.job="senior software engineer";
		emp2.sal=150000;
		emp2.display();
		
		Employee emp3=new Employee();
		emp3.eid=103;
		emp3.ename="suresh";
		emp3.job="junior software engineer";
		emp3.sal=100000;
		emp3.display();
	}

}
