import java.util.Scanner;
class AgeInput 
{
	public static void main(String[] args) 
	{
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter Your Age :");
		int age = scn.nextInt();
		if(age<16)
			System.out.println("You Cannot Drive ");
		else if(age<18)
			System.out.println("You Cannot Vote ");
		else if(age<25)
			System.out.println("You Cannot Rent a Car ");
		else
			System.out.println("You Can Do Anything ");
	}
}
