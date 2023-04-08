package upcasting;

public class Customer extends Person
{
	int id;
	long mob;
	public Customer(String name, int age, int id, long mob)
	{
		super(name, age);
		this.id=id;
		this.mob=mob;
	}
	
	void customerInfo()
	{
		System.out.println(name);
		System.out.println(id);
		System.out.println(mob);
		System.out.println(age);
	}

}
