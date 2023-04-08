// user define data type

class Employee
{
	int eId;
	String eName;
	int eSalary;
	String eDesig;

	void employeeInfo()
	{
		System.out.println("Employee Id :"+eId);
		System.out.println("Employee name :"+eName);
		System.out.println("Employee salary :"+eSalary);
		System.out.println("Employee designation :"+eDesig);
	}
}

class MainRunner06
{
	public static void main(String[] args) 
	{
		Employee e1=new Employee();
		e1.eId=123;
		e1.eName="Ramesh";
		e1.eSalary=45000;
		e1.eDesig="Associate Software eng.";

		Employee e2=new Employee();
		e2.eId=124;
		e2.eName="Rajesh";
		e2.eSalary=55000;
		e2.eDesig="Manager";

		Employee e3=new Employee();
		e3.eId=123;
		e3.eName="Savarkar";
		e3.eSalary=65000;
		e3.eDesig="Lead Developer";

		e1.employeeInfo();
		System.out.println("=======================");
		e2.employeeInfo();
		System.out.println("=======================");
		e3.employeeInfo();
	}
}