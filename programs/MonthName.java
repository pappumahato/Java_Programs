import java.util.Scanner;
class MonthName
{
	public static void main(String arg[])
	{
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter month name (lower case): ");
		String mon=scn.next();
		switch(mon)
		{
			case "january" : System.out.println("it is 1st month of the year");
		}
	}
}