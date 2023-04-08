// method to chect number is prime or not

import java.util.Scanner;
class CheckPrime
{
	public static void main(String arg[])
	{
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter the number :");
		int num = scn.nextInt();
		boolean res = isPrime(num);
		if(res)
			System.out.println(num+" is a prime number");
		else
			System.out.println(num+" is not a prime number");
	}

	static boolean isPrime(int n)
	{
		int i=2;
		while(i<=n/2)
		{
			if(n%i==0)
				return false;
			i++;
		}
		return true;
	}
}


/*
for(int i=2;i<=n/2;i++)
{
	if(n%i==0)
	return false;
}
return true;

*/