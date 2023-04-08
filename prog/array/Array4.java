//sum of element
import java.util.Scanner;
class Array4
{
	public static void main(String[] args) 
	{
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter number of element you want to enter");
		int n=scn.nextInt();
		int ar[]=new int[n];
		System.out.println("Enter "+n+" integer value");
		for(int i=0;i<ar.length;i++)
			ar[i]=scn.nextInt();
		int sum=0;
		for(int i=0;i<ar.length;i++)
			sum=sum+ar[i];
		System.out.println("Sum of "+n+" element is "+sum);
	}
}