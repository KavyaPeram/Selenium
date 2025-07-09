package ecommerceProject;

public class StudentMain 
{

	public static void main(String[] args) 
	{
		/*Student stu=new Student();
		
		//using object reference
		stu.sid=101;
		stu.sname="kavya";
		stu.grad='A';
		
		//using methods
		stu.setStudentData(102, "John", 'B');
		stu.printStudentData();	*/
		
		//using constructor
		Student st=new Student(103,"subbu",'c');
		st.printStudentData();
	}

}
