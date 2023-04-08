import java.util.Scanner;
class DayNumber
{
	public static void main(String[] args) 
	{
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter month number");
		int num=scn.nextInt();
		int res=noOfDays(num);
		if(res==0)
			System.out.println("please enter valid month number");
		else
		System.out.println("number of days = "+res);
	}

	static int noOfDays(int n)
	{
		switch(n)
		{
			case 1: 
			case 3:
			case 5:
			case 7:
			case 8:
			case 10:
			case 12:return 31;
			case 2: return 28;
			case 4: 
			case 6:
			case 9:
			case 11:return 30;	
		}
		return 0;
	}
}