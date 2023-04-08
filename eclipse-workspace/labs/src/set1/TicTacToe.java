package set1;

import java.util.Random;
import java.util.Scanner;

public class TicTacToe 
{
	public static boolean check(char c , char arr[][])
	{
		for (int i = 0; i < 3; i++)
		{
			if(arr[i][0]==c&&arr[i][1]==c&&arr[i][2]==c)
			{
				return true;
			}
			else if(arr[0][i]==c&&arr[1][i]==c&&arr[2][i]==c)
			{
				return true;
			}
			
		}
		
		if(arr[0][0]==c&&arr[1][1]==c&&arr[2][2]==c)
		{
			return true;
		}
		else if(arr[0][2]==c&&arr[1][1]==c&&arr[2][0]==c)
		{
			return true;
		}
		return false;
	}
	
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		char arr[][]=new char[3][3];
		for (int i = 0; i < 3; i++) 
		{
			for (int j = 0; j < 3; j++) 
			{
				arr[i][j]='C';
				
			}
			
		}
		
		int count=9;
		Random r=new Random();
		boolean flag=true;
		while(count-->0)
		{
			if(flag)
			{
				int x=r.nextInt(3);
				int y=r.nextInt(3);
				if(arr[x][y]!='C')
				{
					count++;
				}
				else
				{
					System.out.println("Computer chance");
					arr[x][y]='O';
					boolean value=check('O',arr);
					for (int i = 0; i < 3; i++)
					{
						for (int j = 0; j < 3; j++) 
						{
							System.out.print(arr[i][j]+" ");
							
						}
						System.out.println();
						
					}
					if(value)
					{
						System.out.println("Computer wins");
						break;
					}
					flag=!flag;
				}
			}
			
			else
			{
				System.out.println("Enter row from 1 to 3 and column from 1 to 3");
				int x=sc.nextInt();
				int y=sc.nextInt();
				if(arr[x][y]!='C')
				{
					System.out.println(" place already occupied take another move");
					count++;
				}
				else
				{
					arr[x-1][y-1]='X';
					flag=!flag;
					for (int i = 0; i < 3; i++) 
					{
						for (int j = 0; j < 3; j++)
						{
							System.out.print(arr[i][j]+" ");
							
						}
						System.out.println();
						
					}
					boolean value=check('X',arr);
					if(value)
					{
						System.out.println("Players wins");
						break;
					}
				}
				System.out.println();
			}
			
		}
		
	}

}
