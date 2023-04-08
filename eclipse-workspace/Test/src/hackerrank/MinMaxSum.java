package hackerrank;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class MinMaxSum {

    // Complete the miniMaxSum function below.
    static void miniMaxSum(int[] arr) {
    	long sum1=0, sum2=0;
    	for (int k = 0; k < arr.length-1; k++) 
    	{
    		for (int i = k+1; i < arr.length; i++)
    		{
				if(arr[k]>arr[i])
				{
					int temp=arr[k];
					arr[k]=arr[i];
					arr[i]=temp;
				}
			}
		}
    	for(int i=0;i<arr.length-1;i++)
    	{
    		sum1=sum1+arr[i];
    	}
    	for (int j = arr.length-1; j > 0; j--) 
    	{
    		sum2=sum2+arr[j];
		}
        long res[]= {sum1,sum2};
        for (int i = 0; i < res.length; i++) 
        {
        	System.out.print(res[i]+" ");
		}


    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[] arr = new int[5];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < 5; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        miniMaxSum(arr);

        scanner.close();
    }
}

