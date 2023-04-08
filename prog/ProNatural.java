// method to return product of first n number

import java.util.Scanner;
class ProNatural 
{
	public static void main(String[] args) 
	{
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter the number : ");
		int n = scn.nextInt();
		ProNatural p = new ProNatural();
		int res = p.mulNatural(n);
		System.out.println("Product of first "+n+" number is : "+res);
	}
	int mulNatural(int x)
	{
		int product=1;
		for(int i=1;i<=x;i++)
		{
			product = product*i;
		}
		return product;
	}
}
