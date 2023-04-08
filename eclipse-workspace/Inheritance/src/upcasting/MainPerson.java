package upcasting;

public class MainPerson 
{
	public static void main(String[] args) 
	{
		Person p1=new Customer("rahul", 25, 123, 52469873);
		System.out.println(p1.name);
		System.out.println(p1.age);
		//System.out.println(p1.sal); sal is not a member of person class
		
		Person p2=new Customer("Rahul", 35, 124, 258746);//upcasting
		System.out.println(p2.name);
		System.out.println(p2.age);
		//System.out.println(p2.id); id is not a member of person class
		
	}

}
