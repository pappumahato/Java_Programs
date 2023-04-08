// method to calculate & display area of Square

import java.util.Scanner;
class AreaSquare
{
	public static void main(String arg[])
	{
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter the side of Square :");
		int s= scn.nextInt();
		isAreaSquare(s);
	}

	static void isAreaSquare(int n)
	{
		int area=n*n;
		System.out.println("Area of square = "+area);
	}
}