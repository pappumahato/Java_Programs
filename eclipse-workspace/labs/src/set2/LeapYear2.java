package set2;

import java.util.Scanner;

public class LeapYear2
{
	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the year");
		int year=sc.nextInt();
		String s=year+"";
		if(s.charAt(2)=='0'&&s.charAt(3)=='0')
			year=year/100;
		if(year%4==0)
			System.out.println("it's a leap year");
		else
			System.out.println("it's not a leap year");
		
	}

}
