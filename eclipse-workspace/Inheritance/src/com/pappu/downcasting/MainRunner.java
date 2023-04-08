package com.pappu.downcasting;

import java.util.Scanner;

public class MainRunner
{
	public static void main(String[] args) 
	{
		Shape sh=getShape();
		if(sh instanceof Circle)
		{
			System.out.println("It is circle");
			Circle c=(Circle)sh;
			System.out.println("Circle area is "+c.circleArea());
		}
		else if(sh instanceof Square)
		{
			System.out.println("It is Square");
			Square sq=(Square)sh;
			System.out.println("Square area is "+sq.squareArea());
		}
		else if(sh instanceof Rectangle)
		{
			System.out.println("It is rectangle");
			Rectangle r=(Rectangle)sh;
			System.out.println("Rectangle area is "+r.rectangleArea());
		}
	}
	public static Shape getShape()
	{
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter the number");
		int num=scn.nextInt();
		if(num%3==0)
			return new Circle(5.6);
		else if(num%5==0)
			return  new Square(4.5);
		else if(num%7==0)
			return new Rectangle(4.7,2.9);
		else 
			return null;
	}

}
