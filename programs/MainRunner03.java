// user define data type

class Customer
{
	int cId;
	String cName;
	long cMob;

	void customerInfo()
	{
		System.out.println("Id :"+cId);
		System.out.println("Name :"+cName);
		System.out.println("Mob :"+cMob);
	}
}



class MainRunner03
{
	public static void main(String[] args) 
	{
		Customer c1=new Customer();
		c1.cId=123;
		c1.cName="Rahul";
		c1.cMob=8765432165L;

		Customer c2=new Customer();
		c1.customerInfo();
		System.out.println("-----------------");
		c2.customerInfo();
	}
}