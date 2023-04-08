import java.util.Scanner;
public class Arrays
{
	//read an array
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

	//display an array
	void dispArr(int[] ar)
	{
		for(int i=0;i<ar.length;i++)
		{
			System.out.print(ar[i]+" ");
		}
		System.out.println();
	}

	//merge two array
	int[] mergeArr(int x[], int y[])
	{
		int z[] =new int[x.length+y.length];
		for(int i=0;i<x.length;i++)
		{
			z[i]=x[i];
		}
		for(int i=0;i<y.length;i++)
		{
			z[x.length+i]=y[i];
		}
		return z;
	}

	//return biggest element from the array
	int biggestArr(int ar[])
	{
		int big=ar[0];
		for(int i=1;i<ar.length;i++)
		{
			if(big<ar[i])
				big=ar[i];
		}
		return big;
	}

	//count even and odd no in an array
	int[] countEO(int ar[])
	{
		int ec=0,oc=0;
		for(int i=0;i<ar.length;i++)
		{
			if(ar[i]%2==0)
				ec++;
			else
				oc++;
		}
		int count[]={ec,oc};
		return count;

		/* 
			int count[]={0,0};
			for(int i=0;i<ar.length;i++)
			{
				count[ar[i]%2]++;
			}
			return count;
		*/
	}

	//alternare array element into one array
	int[] zigZag(int a[], int b[])
	{
		int c[]=new int[a.length+b.length];
		int k=0,i=0;
		while(i<a.length&&i<b.length)
		{
			c[k++]=a[i];
			c[k++]=b[i++];
		}
		while(i<a.length)
		{
			c[k++]=a[i++];
		}
		while(i<b.length)
		{
			c[k++]=b[i++];
		}
		return c;
	}

	// wap to merge two sorted array
	int[] mergeSort(int a[], int b[])
	{
		int c[]=new int[a.length+b.length];
		int i=0,j=0,k=0;
		while(i<a.length&&j<b.length)
		{
			if(a[i]<b[j])
				c[k++]=a[i++];
			else
				c[k++]=b[j++];
		}
		while(i<a.length)
		{
			c[k++]=a[i++];
		}
		while(j<b.length)
		{
			c[k++]=b[j++];
		}
		return c;
	}

	//nth biggest element in unique array
	int nthBiggest(int ar[], int n)
	{
		for(int i=0;i<ar.length;i++)
		{
			int count=0;
			for(int j=0;j<ar.length;j++)
			{
				if(ar[j]>ar[i])
					count++;
			}
			if(count==n-1)
					return ar[i];
		}
		return 0;
	}
}