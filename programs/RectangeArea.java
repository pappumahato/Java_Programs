// method to display Area of rectangle

import java.util.Scanner;
class RectangeArea
{
	public static void main(String arg[])
	{
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter Length :");
		int l=scn.nextInt();
		System.out.println("Enter the breadth :");
		int b=scn.nextInt();
		areaRectangle(l,b);
	}

	static void areaRectangle(int x, int y)
	{
		int area=x*y;
		System.out.println("Area of rectangle = "+area);
	}
}