// validate the date using nested if or else if ladder

import java.util.Scanner;
class ValidateDate
{
	public static void main(String args[])
	{
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter date(dd)");
		int d=scn.nextInt();
		System.out.println("Enter month(mm)");
		int m=scn.nextInt();
		System.out.println("Enter year(yyyy)");
		int y=scn.nextInt();
		if(m<1 || m>12)
			System.out.println("invalid month "+d+"/"+m+"/"+y);
		else if(d<1)
			System.out.println("invalid date "+d+"/"+m+"/"+y);
		else if(m==1||m==3||m==5||m==7||m==8||m==10||m==12)
		{
			if(d>31)
				System.out.println("invalid date "+d+"/"+m+"/"+y);
			else
				System.out.println("Valid Date "+d+"/"+m+"/"+y);
		}
		else if(m==4||m==6||m==9||m==11)
		{
			if(d>30)
				System.out.println("invalid date "+d+"/"+m+"/"+y);
			else
				System.out.println("Valid Date "+d+"/"+m+"/"+y);
		}
		else if(m==2)
		{
			if(y%400==0||(y%4==0&&y%100!=0))
			{
				if(d>29)
					System.out.println("invalid date "+d+"/"+m+"/"+y);
				else
					System.out.println("Valid Date "+d+"/"+m+"/"+y);
			}
			else if(d>28)
				System.out.println("invalid date "+d+"/"+m+"/"+y);
			else
				System.out.println("Valid Date "+d+"/"+m+"/"+y);
		}
	}
}
//+d+"/"+m+"/"+y