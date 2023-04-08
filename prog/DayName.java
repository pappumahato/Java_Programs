import java.util.Scanner;
class DayName 
{
	public static void main(String[] args) 
	{
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter the corresponding Day number :");
		int n = scn.nextInt();
		if(n==1)
			System.out.println("Corresponding Day is Monday");
		else if(n==2)
			System.out.println("Corresponding Day is Tuesday");
		else if(n==3)
			System.out.println("Corresponding Day is Wednesday");
		else if(n==4)
			System.out.println("Corresponding Day is Thursday");
		else if(n==5)
			System.out.println("Corresponding Day is Friday");
		else if(n==6)
			System.out.println("Corresponding Day is Saturday");
		else if(n==7)
			System.out.println("Corresponding Day is Sunday");
		else
			System.out.println("Invalid Number Please Enter Number From (1 to 7)");

	}
}
