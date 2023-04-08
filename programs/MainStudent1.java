class MainStudent1
{
	public static void main(String arg[])
	{
		System.out.println("Main method started");
		Student.cloCode=420;
		Student s1=new Student();
		s1.sId=123;
		s1.sName="Rajesh";
		s1.per=67.86;

		Student s2=new Student();
		s2.sId=124;
		s2.sName="Ramesh";
		s2.per=86.74;

		Student s3=new Student();
		s3.sId=125;
		s3.sName="Rahul";
		s3.per=75.43;

		s1.dispInfo();
		System.out.println("---------------------");
		s2.dispInfo();
		System.out.println("---------------------");
		s3.dispInfo();
	}
}


class Student
{
	static int cloCode;
	int sId;
	String sName;
	double per;
	void dispInfo()
	{
		System.out.println("College code "+cloCode);
		System.out.println("Student name "+sName);
		System.out.println("Student id "+sId);
		System.out.println("Percentage "+per);
	}
}