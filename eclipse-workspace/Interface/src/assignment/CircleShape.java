package assignment;

public class CircleShape implements Shape
{
	int rad;

	public CircleShape(int rad) 
	{
		this.rad = rad;
	}
	
	public void getArea()
	{
		double area=3.143*rad*rad;
		System.out.println("Area of circle is "+area);
	}
	

}
