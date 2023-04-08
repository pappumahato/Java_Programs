package assignment;

public class Rectangle implements Shape
{
	int l,b;

	public Rectangle(int l, int b) 
	{
		this.l = l;
		this.b = b;
	}
	
	public void getArea()
	{
		System.out.println("Area of Rectangle is "+(l*b));
	}
	

}
