import java.util.Scanner;
class GenderGame
{
	public static void main(String[] args)
	{

		Scanner scn = new Scanner(System.in);
		System.out.println("What is your gender (M or F):");
		String gender = scn.next();
		System.out.println("First Name :");
		String fname = scn.next();
		System.out.println("Last Name :");
		String lname = scn.next();
		System.out.println("Age :");
		int age = scn.nextInt();

		if(gender.equals("F"))
		{
			if(age>=20)
			{
				System.out.println("Are you married, "+fname+"(y or n)");
				String res = scn.next();

				if(res.equals("Y"))
					System.out.println("Then I shall call you Mrs. "+lname);
				else
					System.out.println("Then I shall call you Ms."+lname);
			}
			else
				System.out.println("Then I shall call you "+fname+" "+lname);
		}
		else
		{
			if(age>=20)
				System.out.println("Then I shall call you Mr "+lname);
			else
				System.out.println("Then I shall call you "+fname+" "+lname);
		}
		

	}
}