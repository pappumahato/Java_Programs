class Employee
{
	int eId;
	String eName;
	double eSalary;
}


class MainEmployee
{
	static double getSalary(Employee e)
	{
		double sal=e.eSalary-(0.10*e.eSalary);
		return sal;
	}

	public static void main(String[] args) 
	{
		Employee e1=new Employee();
		e1.eId=123;
		e1.eName="Ramesh";
		e1.eSalary=40000;

		Employee e2=new Employee();
		e2.eId=124;
		e2.eName="Rajesh";
		e2.eSalary=60000;

		double res = getSalary(e1);
		System.out.println("Salary after deducting 10% :"+res);

		double res1 = getSalary(e2);
		System.out.println("Salary after deducting 10% :"+res1);
	}
}