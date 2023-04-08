import java.util.Scanner;
class IntegerInput
{
	public static void main(String[] args) 
	{
		Scanner scn=new Scanner(System.in);
		System.out.println("From.....  ");
		int n1=scn.nextInt();
		System.out.println("To...  ");
		int n2=scn.nextInt();
		System.out.println("By...");
		int n3=scn.nextInt();

		if(n2<n1 || n3<1)
			System.out.println("Invalid input");
		else
		{
			for(int i=n1;i<=n2;i=i+n3)
				System.out.print(i+" ");
		}
	}
}