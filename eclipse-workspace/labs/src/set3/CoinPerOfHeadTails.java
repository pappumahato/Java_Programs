package set3;

import java.util.Scanner;

public class CoinPerOfHeadTails 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int d=(int)(Math.random()*100);
		System.out.println(d);
		if(d>=50)
			System.out.println("Head");
		else
			System.out.println("Tails");
		System.out.println("-------------------------");
		System.out.println(Math.random());
		System.out.println((int)(Math.random()*100));
	}
}
