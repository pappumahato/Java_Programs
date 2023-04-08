package com.pappu.downcasting;

public class TestGold 
{
	public static void main(String[] args) 
	{
		Shop s=new Shop();
		Gold g=s.luckyDraw();
		
		if(g instanceof Bracelet)
		{
			Bracelet b=(Bracelet)g;
			b.wearToHand();
		}
		
		else if(g instanceof Ring)
		{
			Ring r=(Ring)g;
			r.wearToFinger();
		}
		
		else if(g instanceof Chain)
		{
			Chain c=(Chain)g;
			c.wearToNeck();
		}
		
		else
			System.out.println("You are not lucky...");
	}
}
