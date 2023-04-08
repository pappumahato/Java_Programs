package com.pappu.method_overriding;

public class MainBread 
{
	public static void main(String[] args) 
	{
		Bread b=new Bread();
		b.eat();
		
		FruitBread fb=new FruitBread();
		fb.eat();
		
		ToastedBread tb=new ToastedBread();
		tb.eat();
		
		System.out.println("------------------------");
		
		Bread b1=new FruitBread();
		b1.eat();
		FruitBread fb1=new ToastedBread();
		fb1.eat();
		Bread b2=new ToastedBread();
		b2.eat();
		System.out.println("-----------------------");
		Object obj=new Object();
		//obj.eat();it is not a member of object class
		
	}

}
