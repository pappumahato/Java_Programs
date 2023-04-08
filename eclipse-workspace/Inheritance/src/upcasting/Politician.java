package upcasting;

public class Politician extends Person
{
	String party;
	double sal;
	String constituency;
	public Politician(String name, int age, String party, double sal, String constituency) 
	{
		super(name, age);
		this.party = party;
		this.sal = sal;
		this.constituency = constituency;
	}
	
	void politInfo()
	{
		System.out.println(name);
		System.out.println(party);
		System.out.println(constituency);
		System.out.println(sal);
		System.out.println(age);
	}
	

}
