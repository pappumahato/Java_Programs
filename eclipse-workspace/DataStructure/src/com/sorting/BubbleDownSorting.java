package com.sorting;

import java.util.Scanner;

public class BubbleDownSorting
{
	public static int[] bubbleDownSort(int a[])
	{
		for (int i = 0; i < a.length-1; i++) 
		{
			for (int j = i+1; j < a.length; j++)
			{
				if (a[i]>a[j]) 
				{
					int t=a[i];
					a[i]=a[j];
					a[j]=t;
				}
			}
		}
		return a;
	}
	
	public static void main(String[] args) 
	{
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter how many element you have");
		int n=scn.nextInt();
		int arr[]=new int[n];
		System.out.println("Enter "+n+" integer values");
		for (int i = 0; i < arr.length; i++) 
		{
			arr[i]=scn.nextInt();
			
		}
		
		int res[]=bubbleDownSort(arr);
		for (int j = 0; j < res.length; j++) 
		{
			System.out.println(res[j]+" ");
		}
		System.out.println();
		
	}

}
