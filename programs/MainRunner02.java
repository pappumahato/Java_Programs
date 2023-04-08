// user define data type 

class MainRunner02
{
	public static void main(String[] args)
	{
		Student s=new Student();
		s.id=123;
		s.name="Ramesh";
		s.per=67.89;

		System.out.println("Name :"+s.name);
		System.out.println("Id :"+s.id);
		System.out.println("Percentage :"+s.per);	

		s.study();
	}
}





class Student
{
	String name;
	int id;
	double per;

	void study()
	{
		System.out.println("Student is studying....");
	}
}