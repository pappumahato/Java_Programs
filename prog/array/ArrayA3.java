import java.util.Scanner;
class ArrayA3
{
	public static void main(String[] args) 
	{
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter the no. of items");
		int n=scn.nextInt();
		int item[]=new int[n];
		System.out.println("Enter "+n+" item value");
		for(int i=0;i<item.length;i++)
		{
			item[i]=scn.nextInt();
		}
		int sum=0;
		for(int i=0;i<item.length;i++)
		{
			sum=sum+item[i];
		}
		double avg=sum/n;
		System.out.println("Average of "+n+" items is "+avg);
	}
}