import java.util.Scanner;
class Story
{
	public static void main(String[] args) 
	{
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter any integer");
		int num=scn.nextInt();
		if(num%3==0 && num%5==0)
			System.out.println("Sanju weds geeta");
		else if(num%3==0)
			System.out.println("Geeta");
		else if(num%5==0)
			System.out.println("Sanju");
		else
			System.out.println("Break up");
	}
}