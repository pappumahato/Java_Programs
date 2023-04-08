import java.util.Scanner;
class AreaCircle
{
	public static void main(String arg[])
	{
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter the value of Radius");
		int r = scn.nextInt();
		double area = 3.14*r*r;
		System.out.println("Area of the is : " + area);
	}	
}