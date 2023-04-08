package upcasting;

public class MainPen 
{
	public static void main(String[] args) 
	{
		Pen p=new Marker();
		System.out.println(p.color);
		System.out.println(p.price);
		System.out.println(p.cname);
		p.write();
	}
}
