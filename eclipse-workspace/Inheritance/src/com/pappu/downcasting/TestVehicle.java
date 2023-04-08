package com.pappu.downcasting;

import java.util.Scanner;

public class TestVehicle
{

	public static void main(String[] args) 
	{
		Vehicle v=getVehicle();
		if(v instanceof Car)
		{
			Car c=(Car)v;
			System.out.println("Car");
		}
		if(v instanceof Bike)
		{
			Bike b=(Bike)v;
			System.out.println("Bike");
		}
		if(v instanceof Truck)
		{
			Truck t=(Truck)v;
			System.out.println("Truck");
		}
	}
	
	public static Vehicle getVehicle()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int num=sc.nextInt();
		if(num==1)
			return new Car();
		else if(num==2)
			return new Bike();
		else if(num==3)
			return new Truck();
		else
			return null;
	}

}
