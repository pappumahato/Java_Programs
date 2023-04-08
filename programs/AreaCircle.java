import java.util.Scanner;
class AreaCircle
{
	public static void main(String arg[])
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Welcome Circle ");
		System.out.println("Enter the radius :");
		double r = s.nextDouble();
		System.out.println(r+" radius circle area is : "+(3.143*r*r));
	}
}