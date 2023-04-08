// count odd number between 1 to N

import java.util.Scanner;
class CountOdd
{
	public static void main(String args[])
	{
		int count=1;
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter the number : ");
		int n=scn.nextInt();
		for(int i=2;i<=n;i++)
		{
			if(i%2==1)
				count++;
		}
		System.out.println("Total odd no. b/w 1 to N are :"+count);
	}
}