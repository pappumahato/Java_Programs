package assignment;

public class Square implements Shape
{
	int side;
	public Square(int side)
	{
		this.side=side;
	}
	
	public void getArea()
	{
		System.out.println("Area of Square is "+(side*side));
	}

}
