class Student
{
	int roll;
	String name;
	String branch;
}

class MainStudent
{
	static void display(Student s)
		{
			System.out.println("Roll number = "+s.roll);
			System.out.println("Name = "+s.name);
			System.out.println("Branch = "+s.branch);
		}
	public static void main(String arg[])
	{
		Student s1=new Student();
		s1.roll=1234;
		s1.name="Ramesh";
		s1.branch="Ece";

		Student s2=new Student();
		s2.roll=1235;
		s2.name="Rajesh";
		s2.branch="Cse";

		display(s1);
		System.out.println("=====================");
		display(s2);
	}
}