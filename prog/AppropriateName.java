import java.util.Scanner;
class AppropriateName
{
	public static void main(String[] args)
	{

		Scanner scn = new Scanner(System.in);
		System.out.println("What is your gender (M or F):");
		String gender = scn.nextLine();
		System.out.println("First Name :");
		String fname = scn.nextLine();
		System.out.println("Last Name :");
		String lname = scn.nextLine();
		System.out.println("Age :");
		int age = scn.nextInt();

		if(age<20)
			System.out.println("Then I shall call you "+fname+" "+lname);
		if(gender.charAt(0)=='f' && (age>=20))
		{
			System.out.println("Are you married "+fname+" (y or n)");
			String ans = scn.next();
			if(ans.charAt(0)=='y')
				System.out.println("Then I shall call you Mrs. "+lname);
			else if(ans.charAt(0)=='n')
				System.out.println("Then I shall call you Ms. "+lname);

		}
		if(gender.charAt(0)=='m' && age>=20)
		{
			System.out.println("Then I shall call you Mr. "+lname);

		}
		

	}
}