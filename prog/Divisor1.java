import java.util.Scanner;
class Divisor1 
{
	public static void main(String[] args) 
	{
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter your number");
		int n = scn.nextInt();
		if(n==0)
		{
			System.out.println("infinite divisor");
		}
		Divisor div = new Divisor();
		int dc = div.countDivisor(n);
		if(dc==2)
			System.out.println(n+" is a prime number");
		else
			System.out.println(n+" is not a prime number");
	}
	int countDivisor(int x)
	{
		int count=0;
		for(int i=1;i<=x;i++)
		{
			if(x%i==0)
				count++;
		}
		return count;
	}
}
