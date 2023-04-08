import java.util.Scanner;
class CircleArea
{
	public static void main(String arg[])
	{
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter the radius");
		int rad=scn.nextInt();
		getArea(rad);
	}

	static void getArea(int n)
	{
		double area=3.143*n*n;
		System.out.println("Area of circle is "+area);
	}
}