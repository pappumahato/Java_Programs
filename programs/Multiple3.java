// multiple of 3 b/w 1 to N

import java.util.Scanner;
class Multiple3
{
	public static void main(String args[])
	{
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter the number : ");
		int n=scn.nextInt();
		for(int i=3;i<=n;i++)
		{
			if(i%3==0)
				System.out.println(i);
		}
	}
}