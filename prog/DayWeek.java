import java.util.Scanner;
class DayWeek
{
	public static void main(String[] args) 
	{
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter the day name");
		String nam=scn.next();
		switch(nam)
		{
			case "monday":
			case "MONDAY":System.out.println("1 st day");
			break;
			case "tuesday":
			case "TUESDAY":System.out.println("1 st day");
			break;
			case "wednesday":
			case "WEDNESDAY":System.out.println("1 st day");
			break;
			case "thursday":
			case "THURSDAY":System.out.println("1 st day");
			break;
			case "friday":
			case "FRIDAY":System.out.println("1 st day");
			break;
			case "saturday":
			case "SATURDAY":System.out.println("1 st day");
			break;
			case "sunday":
			case "SUNDAY":System.out.println("1 st day");
			break;
			default: System.out.println("invalid number");
		}
	}
}