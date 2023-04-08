import java.util.Scanner;
class LeapYear 
{
	public static void main(String[] args) 
	{
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter the year to check Leap year :");
		int yr=scn.nextInt();
		if((yr%4==0 && yr%100!=0)||yr%400==0)
			System.out.println(yr+" is Leap Year");
		else
			System.out.println(yr+" is not Leap Year");
	}
}
