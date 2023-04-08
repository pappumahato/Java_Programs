import java.util.Scanner;
class DivisorSum 
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
		DivisorSum div = new DivisorSum();
		int dc = div.sumDivisor(n);
		System.out.println("sum of divisor = "+dc);
	}
	int sumDivisor(int x)
	{
		int sum=0;
		for(int i=1;i<=x;i++)
		{
			if(x%i==0)
				sum=sum+i;
		}
		return sum;
	}
}
