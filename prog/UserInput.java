import java.util.Scanner;
class UserInput
{
	public static void main(String args[])
	{
		Scanner scn= new Scanner(System.in);
		System.out.println("Enter id ");
		int id = scn.nextInt();
		
		System.out.println("Enter Name ");
		String name = scn.nextLine();
		
		System.out.println("Enter Roll ");
		int roll = scn.nextInt();
		
		System.out.println("Id is : "+id);
		System.out.println("Name is : "+name);
		System.out.println("Roll is : "+roll);
		
	}
}