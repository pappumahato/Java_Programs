import java.util.Random;
import java.util.Scanner;
class GuessNumber
{
	public static void main(String args[])
	{
		Random rd = new Random();
		int rno = rd.nextInt(10);
		
		Scanner scn = new Scanner(System.in);
		System.out.println("Guess your number (0 to 9):");
		int no = scn.nextInt();
		
		if(no==rno)
			System.out.println("WOW! Your Guess is Correct ");
		else
			System.out.println("oh! Sorry your guess is wrong try again ");
		
		
	}
}