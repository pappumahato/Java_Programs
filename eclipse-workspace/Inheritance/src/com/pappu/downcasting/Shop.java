package com.pappu.downcasting;

import java.util.Scanner;

public class Shop 
{
	Gold luckyDraw()
	{
		Scanner scn=new Scanner(System.in);
		Gold g=null;
		System.out.println("Press any key and enter");
		String goldType=scn.next();
		char ch=goldType.charAt(0);
		if(ch%26>=15)
			g=new Chain();
		else if(ch%26>=10)
			g=new Bracelet();
		else if(ch%26>=5)
			g=new Ring();
		return g;
	}

}
