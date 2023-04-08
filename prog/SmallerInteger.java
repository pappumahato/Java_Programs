import java.util.Scanner;
class SmallerInteger 
{
	public static void main(String[] args) 
	{
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter Three Number :");
		int n1 = scn.nextInt();
		int n2 = scn.nextInt();
		int n3 = scn.nextInt();
		if(n1<n2 && n1<n3)
			System.out.println(n1+" is Smaller");
		else if(n2<n1 && n2<n3)
			System.out.println(n2+" is Smaller");
		else
			System.out.println(n3+" is Smaller");
	}
}
