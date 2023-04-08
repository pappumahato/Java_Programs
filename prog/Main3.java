import java.util.Scanner;
class Main3
{
	public static void main(String arg[])
	{
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter the number ");
		int n = scn.nextInt();
		
		String st[] = {"EVEN","ODD"};
		System.out.println(n + " is " + st[n%2] + " Number");
	}
}