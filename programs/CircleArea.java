// method to calculate the area of a circle

import java.util.Scanner;
class CircleArea
{
	public static void main(String arg[])
	{
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter the radius :");
		double r = scn.nextDouble();
		calculateArea(r);
	}

	static void calculateArea(double n)
	{
		System.out.println("received radius = "+n);
		double area=3.143*n*n;
		System.out.println("Area is : "+area);
	}
}