package set2;

import java.util.Scanner;

public class StockReport 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		String s[]=new String[n];
		int arr[]=new int[n];
		int arr2[]=new int[n];
		for (int i = 0; i < n; i++) 
		{
			s[i]=sc.next();
			arr[i]=sc.nextInt();
			arr2[i]=sc.nextInt();
		}
		
		long total=0;
		for (int i = 0; i < n; i++) 
		{
			System.out.println(s[i]+" "+(arr[i]*arr2[i]));
			total+=(arr[i]*arr2[i]);
		}
		System.out.println("Total Price "+total);
	}
}
