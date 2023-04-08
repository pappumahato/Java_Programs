// Least among three number
import java.util.Scanner;
class LeastThree
{
	public static void main(String arg[])
	{
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter three number : ");
		int n1=scn.nextInt();
		int n2=scn.nextInt();
		int n3=scn.nextInt();
		if(n1<n2&&n1<n3)
			System.out.println(n1+" is smaller");
		else if(n2<n3)
			System.out.println(n2+" is smaller");
		else
			System.out.println(n3+" is smaller");
	}
}