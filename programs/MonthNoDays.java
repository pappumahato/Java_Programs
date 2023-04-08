// read the month name & display the month number and number of days in that month

import java.util.Scanner;
class MonthNoDays
{
	public static void main(String[] args) 
	{
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter the month name (lower case): ");
		String name=scn.next();
		switch(name)
		{
			case "january": System.out.println("it is 1st month of the year");
							System.out.println("it has 31 days");
				break;
			case "february": System.out.println("it is 2nd month of the year");
							System.out.println("it has 28 or 29 days");
				break;
			case "march": System.out.println("it is 3rd month of the year");
							System.out.println("it has 31 days");
				break;
			case "april": System.out.println("it is 4th month of the year");
							System.out.println("it has 30 days");
				break;
			case "may": System.out.println("it is 5th month of the year");
							System.out.println("it has 31 days");
				break;
			case "june": System.out.println("it is 6th month of the year");
							System.out.println("it has 30 days");
				break;
			case "july": System.out.println("it is 7th month of the year");
							System.out.println("it has 31 days");
				break;
			case "august": System.out.println("it is 8th month of the year");
							System.out.println("it has 31 days");
				break;
			case "september": System.out.println("it is 9th month of the year");
							System.out.println("it has 30 days");
				break;
			case "october": System.out.println("it is 10th month of the year");
							System.out.println("it has 31 days");
				break;
			case "november": System.out.println("it is 11th month of the year");
							System.out.println("it has 30 days");
				break;
			case "december": System.out.println("it is 12th month of the year");
							System.out.println("it has 31 days");
				break;
			default: System.out.println("invalid month number");
		}	
	}
}