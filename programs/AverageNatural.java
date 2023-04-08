// calculate the average of first N natural number

import java.util.Scanner;
class AverageNatural
{
	public static void main(String args[])
	{
		float sum=1,count=1;
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter the number : ");
		float n = scn.nextFloat();
		for(int i=2;i<=n;i++)
		{
			sum=sum+i;
			count++;
		}
		double avg=sum/n;
		System.out.println("Average of first n natural number is : "+avg);
	}
}