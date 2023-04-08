import java.util.Scanner;
class SimpleIf1
{
	public static void main(String args[])
	{
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter the number : ");
		int n = scn.nextInt();
		if(n%3==0 && n%5==0)
			System.out.println("Sanju weds Gita");
		else if(n%5==0)
			System.out.println("Gita");
		else if(n%3==0)
			System.out.println("Sanju");
		else
			System.out.println("Breakup");	
	}
}
