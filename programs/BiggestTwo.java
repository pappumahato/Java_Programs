// Biggest among two number

import java.util.Scanner;
class BiggestTwo
{
	public static void main(String args[])
	{
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter two number : ");
		int n1 = scn.nextInt();
		int n2 = scn.nextInt();
		if(n1>n2)
			System.out.println(n1+" is bigger");
		else
			System.out.println(n2+" is bigger");
	}
}