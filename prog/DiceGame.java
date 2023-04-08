import java.util.Scanner;
import java.util.Random;
class DiceGame
{
	public static void main(String[] args)
	{
		Random rd = new Random();
		Scanner scn = new Scanner(System.in);
		System.out.println("Player1 name: ");
		String name1=scn.next();
		System.out.println("Player2 name: ");
		String name2=scn.next();
		int count1=0,count2=0;

		while(count1<100&&count2<100)
		{
			System.out.println(name1+" press any button to toss ");
				scn.next();
			int r1 = rd.nextInt(6)+1;
			System.out.println("you scored "+r1);
			count1=count1+r1;
			if(count1==100)
			{
				System.out.println(name1+" won the game ");
				break;
			}
				if(count1>100)
				{
					count1=count1-r1;
				}
			System.out.println(name1+" total score is "+count1);
		System.out.println("---------------------------------------------------------------");


		System.out.println(name2+" press any button to toss ");
				scn.next();
			int r2 = rd.nextInt(6)+1;
			System.out.println("you scored "+r2);
			count2=count2+r2;
			if(count2==100)
			{
				System.out.println(name2+" won the game ");
				break;
			}
				if(count2>100)
				{
					count2=count2-r2;
				}
			System.out.println(name2+" total score is "+count2);
		System.out.println("---------------------------------------------------------------");
		}

	}
}