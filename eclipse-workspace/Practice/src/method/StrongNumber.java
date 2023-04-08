package method;

import java.util.Scanner;

public class StrongNumber
{
	public static void main(String[] args) 
	{
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=scn.nextInt();
		boolean res=isStrong(n);
		if(res)
			System.out.println(n+" is a strong number");
		else
			System.out.println(n+" is not a strong number");
		
	}

	private static boolean isStrong(int n) 
	{
		int sum=0,t=n;
		do {
			int r=n%10;
			sum=sum+fact(r);
			n=n/10;
		}while(n!=0);
		return sum==t;
	
	}

	private static int fact(int r) 
	{
		int f=1;
		while(r>1)
		{
			f=f*r;
			r--;
		}
		return f;
	}

}
