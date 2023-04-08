package com.pappu.method_overriding;

public class MainAnimal 
{
	public static void main(String[] args) 
	{
		Animal a = new Animal();
		a.eat();
		a.noise();
		
		System.out.println("---------------");
		Animal ac=new Cat();
		ac.noise();
		ac.eat();
		System.out.println("---------------");
		Animal ad=new Dog();
		ad.eat();
		ad.noise();
		System.out.println("---------------");
		Animal at=new Tiger();
		at.noise();
		at.eat();
	}

}
