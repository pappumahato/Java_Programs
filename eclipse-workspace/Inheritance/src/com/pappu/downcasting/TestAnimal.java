package com.pappu.downcasting;

import java.util.Scanner;

public class TestAnimal
{
	public static void main(String[] args) 
	{
		Animal a=getAnimal();
		if(a instanceof Cat)
		{
			Cat c=(Cat)a;
			c.meow();
		}
		if(a instanceof Dog)
		{
			Dog d=(Dog)a;
			d.bark();
		}
	}
	private static Animal getAnimal()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int num=sc.nextInt();
		if(num%2==0)
			return new Cat();
		else
			return new Dog();
	}

}
