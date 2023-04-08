package hackerrank;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class PosNegZeroCount {

    // Complete the plusMinus function below.
    static void plusMinus(int[] arr) {
        double pc=0, nc=0, oc=0, n=arr.length;
        for(int i=0;i<n;i++)
        {
            if(arr[i]==0)
            {
                oc++;
            }
            else if(arr[i]<0)
            {
                nc++;
            }
            else{
                pc++;
            }
        }
        double r1=pc/n;
        double r2=nc/n;
        double r3=oc/n;
        System.out.println(r1);
        System.out.println(r2);
        System.out.println(r3);


    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] arr = new int[n];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        plusMinus(arr);

        scanner.close();
    }
}

