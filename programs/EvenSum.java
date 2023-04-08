// Sum of even number b/w 1 to N

import java.util.Scanner;
class EvenSum
{
	public static void main(String[] args) 
	{
		int sum=0;
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter the number :");
		int n=scn.nextInt();
		for(int i=1;i<=n;i++)
		{
			if(i%2==0)
				sum=sum+i;
		}
		System.out.println("Sum of 1 to "+n+" = "+sum);
		
	}
}