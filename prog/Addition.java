import java.util.Scanner;
class Addition 
{
	public static void main(String[] args) 
	{
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter the number");
		int num = scn.nextInt();
		Addition ad=new Addition();
		int res = ad.sumOfDigit(num);
		System.out.println("Sum of digit of "+num+" is "+res);

	}
	int sumOfDigit(int n)
	{
		int d1,sum=0;
		while (n!=0)
		{
			d1=n%10;
			sum=sum+d1;
			n=n/10;
		}
		return sum;
	}
}
