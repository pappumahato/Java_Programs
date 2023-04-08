// check the user entered year is leap year or not

import java.util.Scanner;
class LeapYear
{
	public static void main(String args[])
	{
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter the year");
		int yr=scn.nextInt();
		if(yr%400==0)
			System.out.println(yr+" is a leap year");
		else if(yr%4==0 && yr%100!=0)
			System.out.println("leap year");
		else
			System.out.println(yr+" is not a leap year");
	}
}

/*
if(yr%400==0 || (yr%4==0&&yr%100!=0))
System.out.println("leap year");
else
System.out.println("not leap year");
*/