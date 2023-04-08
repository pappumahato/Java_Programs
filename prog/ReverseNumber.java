/* method to reverse the number */

import java.util.Scanner;
class ReverseNumber
{
	public static void main(String[] args) 
	{
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter a number to reverse :");
		int num = scn.nextInt();
		ReverseNumber rn = new ReverseNumber();
		String res = rn.isReverse(num);
		System.out.println(res+" is the reverse number of "+num);
	}

	String isReverse(int x)
	{
		String rev = "";
		while(x!=0)
		{
			int rem = x%10;
			rev = rev+rem;
			x=x/10;
		}
		return rev;
	}
}