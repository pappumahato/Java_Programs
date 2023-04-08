package com.pappu.method_overriding;

public class VolvoBus extends Bus
{
	void drive()
	{
		System.out.println("vovo bus is driving");
	}
	
	void run(String str)
	{
		System.out.println(str+" is running");//over loading
	}
	
	void run()//overriding
	{
		System.out.println("volvo bus is running");
	}

}
