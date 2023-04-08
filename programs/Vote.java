// take name and age and display person is eligible for vote or not
import java.util.Scanner;
class Vote
{
	public static void main(String arg[])
	{
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter your name : ");
		String name=scn.nextLine();
		System.out.println("Hey "+name+" enter your age :");
		int age=scn.nextInt();
		if(age>17)
			System.out.println(name+" is eligible for vote");
		else
			System.out.println(name+" is not eligible for vote");
	}
}
