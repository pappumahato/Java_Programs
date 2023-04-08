package com.pappu.downcasting;

public class Square extends Shape
{
	double side;
	public Square(double side)
	{
		this.side=side;
	}
	public double squareArea()
	{
		return side*side;
	}
}
