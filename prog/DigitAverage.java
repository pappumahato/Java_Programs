/* Method to return the average of digit */


import java.util.Scanner;
class DigitAverage
{
	public static void main(String args[])
	{
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter the number ");
		int num = scn.nextInt();

		DigitAverage da = new DigitAverage();
		int avg1 = da.isAverage(num);
		System.out.println("The average of digit of "+num+" is "+avg1);
	}
	int isAverage(int n)
	{
		int sum=0,count=0,avg;
		while(n!=0)
		{
			int d1 = n%10;
			sum = sum+d1;
			count++;
			n = n/10;
		}
		avg = sum/count;
		return avg;
	}
}
