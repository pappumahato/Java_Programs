import java.util.Scanner;
class FizzBuzz
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int num=sc.nextInt();
		String res=isCheck(num);
		System.out.println(res);
	}

	static String isCheck(int n)
	{
		if(n%5==0 && n%7==0)
			return "Fizz & Buzz";
		if(n%5==0)
			return "Fizz";
		if(n%7==0)
			return "Buzz";
		return null;
	}
}