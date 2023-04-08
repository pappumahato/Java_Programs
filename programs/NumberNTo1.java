// print number b/w N to 1

import java.util.Scanner;
class NumberNTo1
{
	public static void main(String args[])
	{
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter the number : ");
		int n=scn.nextInt();
		for(;n>0;n--)
			System.out.println(n);
	}
}