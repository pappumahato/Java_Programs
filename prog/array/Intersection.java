import java.util.Scanner;
public class Intersection
{
	int[] readArr()
	{
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter number of element you have");
		int n=scn.nextInt();
		int arr[]=new int[n];
		System.out.println("Enter "+n+" integer element to the array");
		for(int i=0;i<arr.length;i++)
			arr[i]=scn.nextInt();
		return arr;
	}

	void dispArr(int ar[])
	{
		for(int i=0;i<ar.length;i++)
			System.out.print(ar[i]+" ");
		System.out.println();
	}

	int[] intersection(int x[], int y)
	{
		int i=0,j=0,k=0;
		int na[]=new int[x.length+y.length];
		while(i<x.length && j<y.length)
		{
			if(x[i]<y[j])
			{
				na[k++]=x[i++];
			}
			else
			{
				na[k++]=y[j++];
			}
		}
		while(i<x.length)
		{
			na[k++]=x[i++];
		}
		while(j<y.length)
		{
			na[k++]=y[j++];
		}
		return na;
	}

	public static void main(String[] args) 
	{
		Intersection ir=new Intersection();
		System.out.println("Read first sorted array");
		int ar1[]=ir.readArr();
		System.out.println("Read second sorted array");
		int ar2[]=ir.readArr();
		int res[]=ir.intersection(ar1,ar2);
		ir.dispArr(res);
	}
}