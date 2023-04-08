import java.util.Scanner;
class BiggerNumber
{
	public static void main(String[] args) 
	{
		int n1,n2;
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter Two Numbers :");
		n1 = scn.nextInt();
		n2 = scn.nextInt();

		if(n1>n2)
			System.out.println(n1+" is Bigger");
		else
			System.out.println(n2+" is Bigger");

	}
}
