package assignment;

public class MainShape 
{
	public static void main(String[] args) 
	{
		Shape s1=new CircleShape(5);
		s1.getArea();
		
		Shape s2=new Rectangle(2,5);
		s2.getArea();
		
		Shape s3=new Square(3);
		s3.getArea();
	}

}
