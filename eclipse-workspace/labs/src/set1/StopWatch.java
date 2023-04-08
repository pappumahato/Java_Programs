package set1;

import java.time.Instant;
import java.util.Scanner;

public class StopWatch 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		long start=0,end=0;
		boolean flag=false;
		while(true)
		{
			System.out.println("for start enter 0 for stop enter 1");
			byte b=sc.nextByte();
			if(b==0)
			{
				start=Instant.now().toEpochMilli();
				flag=true;
			}
			
			else if(b==1&&flag)
			{
				end=Instant.now().toEpochMilli();
				break;
			}
		}
		System.out.println((end-start)/1000+" Seconds");
		
	}
}