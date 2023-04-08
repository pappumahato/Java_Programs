import java.util.Scanner;
class Main1
{
		public static void main(String arg[])
			{
				System.out.println("main method started");
				Scanner scn = new Scanner(System.in);
				System.out.println("Enter the value: ");
				int n = scn.nextInt();
				if(n%2==0)
					System.out.println(n + "is even number");
				else
					System.out.println(n + "is odd number");
			}
}