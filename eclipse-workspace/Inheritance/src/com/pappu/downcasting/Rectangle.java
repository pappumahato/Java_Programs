package com.pappu.downcasting;

public class Rectangle extends Shape
{
	double l,b;

	public Rectangle(double l, double b) 
	{
		super();
		this.l = l;
		this.b = b;
	}
	public double rectangleArea()
	{
		return l*b;
	}
	
}
