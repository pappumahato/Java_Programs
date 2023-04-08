import java.util.Scanner;
class MonthNumber
{
	public static void main(String[] args) 
	{
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter month name");
		String mn=scn.next();
		int res=isMonthNumber(mn);
		if(res==0)
			System.out.println("Please enter valid month name..");
		else
			System.out.println(mn+" Month number is "+res);
	}

	static int isMonthNumber(String m)
	{
		switch(m)
		{
			case "JANUARY":
			case "january": return 1;

			case "FEBRUARY":
			case "february": return 2;

			case "MARCH":
			case "march": return 3;

			case "APRIL":
			case "april": return 4;

			case "MAY":
			case "may": return 5;

			case "JUNE":
			case "june": return 6;

			case "JULY":
			case "july": return 7;

			case "AUGUST":
			case "august": return 8;

			case "SEPTEMBER":
			case "september": return 9;

			case "OCTOBER":
			case "october": return 10;

			case "NOVEMBER":
			case "november": return 11;

			case "DECEMBER":
			case "december": return 12;
			
			default:return 0;
		}
	}
}