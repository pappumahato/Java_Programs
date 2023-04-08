import java.util.Scanner;
class AreaCirRectangle
{
	public static void main(String[] args) 
	{
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter length and Breadth");
		int n1=scn.nextInt();
		int n2=scn.nextInt();
		int area=isArea(n1,n2);
		System.out.println("Area of rectangle is "+area);
		int cir=isCir(n1,n2);
		System.out.println("Circumference of rectangle is "+cir);
	}

	static int isArea(int a,int b)
	{
		return a*b;
	}

	static int isCir(int a,int b)
	{
		return 2*(a*b);
	}
}