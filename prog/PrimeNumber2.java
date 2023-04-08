/* j.p to print the prime numbers b/w 1 to 1000*/

import java.util.Scanner;
class PrimeNumber2
{
	public static void main(String[] args) 
	{
		String pn="";
		int count=0;
		for(int i=1;i<=1000;i++)
		{
			for(int j=i;j>=1;j--)
			{
				if(i%j==0)
					count++;
			}
			if(count==2)
			{
				pn=pn+i+" ";
			}
		}
		System.out.println("the prime number b/w 1 and 1000 are :"+pn);
		
	}
}





/*
boolean isPrime(int x)
	{
		for(int i=2;i<=x/2;i++)
		{
			if(x%i==0)
				return false;
		}
		return true;
	}
}*/