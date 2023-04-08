package com.pappu.method_overriding;

public class MainRunner
{
	public static void main(String[] args) 
	{
		System.out.println("main method started");
		Bus b=new Bus();
		b.run();
		System.out.println("================================");
		VolvoBus vb=new VolvoBus();
		vb.run("Rupesh");
		vb.run();
		vb.drive();
		Bus b1=vb;//upcasting
		b1.run();//it gives the volvo bus implementation
	}

}
