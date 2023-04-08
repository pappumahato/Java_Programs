package com.pappu.downcasting;

public class Circle extends Shape
{
	double rad;
	public Circle(double rad)
	{
		this.rad=rad;
	}
	public double circleArea()
	{
		return 3.143*rad*rad;
	}
}
