import java.util.Scanner;
class ArraysAssign
{
	int[] readArr()
	{
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter how many values you have");
		int n=scn.nextInt();
		int ar[]=new int[n];
		System.out.println("Enter "+n+" Integer values");
		for(int i=0;i<ar.length;i++)
		{
			ar[i]=scn.nextInt();
		}
		return ar;
	}


	int smallestArr(int ar[])
	{
		int sm=ar[0];
		for(int i=1;i<ar.length;i++)
		{
			if(sm>ar[i])
				sm=ar[i];
		}
		return sm;
	}

	int[] countPN(int a[])
	{
		int pc=0,nc=0;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]<0)
				nc++;
			else
				pc++;
		}
		int count[]={pc,nc};
		return count;
	}

	int primeArr(int ar[])
	{
		int pn=0;
		for(int i=0;i<ar.length;i++)
		{
			if(isPrime(ar[i]))
				pn++;
		}
		return pn;
	}

	static boolean isPrime(int n)
	{
		for(int i=2;i<=n/2;i++)
		{
			if(n%i==0)
				return false;
		}
		return true;
	}

	public static void main(String[] args) 
	{
		ArraysAssign aa=new ArraysAssign();
		System.out.println("Read an array");
		int arr[]=aa.readArr();

		int res1=aa.smallestArr(arr);
		System.out.println("Smallest element is "+res1);
		System.out.println("=======================");

		int res2[]=aa.countPN(arr);
		System.out.println(res2[0]+" positive element and "+res2[1]+" negative element are present");
		System.out.println("=======================");

		int res3=aa.primeArr(arr);
		System.out.println(res3+" prime number are present");

	}


}