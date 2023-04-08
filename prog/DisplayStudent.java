import java.util.Scanner;
class DisplayStudent
{
	public static void main(String[] args) 
	{
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter name");
		String name=scn.nextLine();
		System.out.println("Enter id");
		int id=scn.nextInt();
		System.out.println("Percentage");
		double per=scn.nextDouble();
		displayInfo(name,id,per);
	}

	static void displayInfo(String name,int id,double per)
	{
		System.out.println("Id: "+id);
		System.out.println("Name: "+name);
		System.out.println("Percentage: "+per);
	}
}