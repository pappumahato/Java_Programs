// read day name from the user & display no. of that day in weak

import java.util.Scanner;
class DayName
{
	public static void main(String args[])
	{
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter day name : ");
		String day=scn.next();
		switch(day)
		{
			case "monday":
			case "MONDAY":System.out.println("1 st day");
				break;
			case "tuesday":
			case "TUESDAY":System.out.println("2 nd day");
				break;
			case "wednesday":
			case "WEDNESDAY":System.out.println("3 rd day");
				break;
			case "thursday":
			case "THURSDAY":System.out.println("4 th day");
				break;
			case "friday":
			case "FRIDAY":System.out.println("5 th day");
				break;
			case "saturday":
			case "SATURDAY":System.out.println("6 th day");
				break;
			case "sunday":
			case "SUNDAY":System.out.println("7 th day");
				break;
			default:System.out.println("invalid day name");

		}
	}
}