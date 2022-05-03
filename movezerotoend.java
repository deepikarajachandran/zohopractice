package com.company;
/*
Input : arr[] = {2, 2, 0, 4, 0, 8}
Output : 4 4 8 0 0 0

Input : arr[] = {0, 2, 2, 2, 0, 6, 6, 0, 0, 8}
Output :  4 2 12 8 0 0 0 0 0 0
 */
import java.util.Arrays;

public class movezerotoend {
    public static void main(String[] args) {

        int[] a={0, 2, 2, 2, 0, 6, 6, 0, 0, 8};
        for(int i=0;i<a.length-1;i++)
        {
            if(a[i]!=0 && a[i]==a[i+1])
            {
                a[i]=2*a[i];
                a[i+1]=0;
            }
        }
        System.out.println(Arrays.toString(a));

        int count=0;

        for(int i=0;i< a.length;i++)
        {
            if(a[i]!=0)
            {
                a[count++]=a[i];
            }
        }
        for(int i=count;i< a.length;i++)
        {
            a[i]=0;
        }

        System.out.println(Arrays.toString(a));
    }
}
