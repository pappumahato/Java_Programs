import java.util.Scanner;
class ArrayA2
{
	public static void main(String[] args) 
	{
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter the no of items");
		int n=scn.nextInt();
		int pr[]=new int[n];
		System.out.println("Enter price of each item");
		for(int i=0;i<pr.length;i++)
			pr[i]=scn.nextInt();
		 double sum=0;
		for(int i=0;i<pr.length;i++)
		{
			sum=sum+(pr[i]-(5*pr[i])/100);
		}
		System.out.println("Total amount by giving 5% discount to each item "+sum);
	}
}