package com.company;
/*
Given array find maximum sum of contiguous sub array
input      {-2 -3 4 -1 -2 1 5 -3}
output 7 elements [ 4 -1 -2 1 5]

 */
public class kadane {
    public static void main(String[] args) {
        int[] a={-3, -4, 5, -1, 2, -4, 6, -1};
        int n=a.length;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<n;i++)
        {
            int sum=0;
            for(int j=i;j<n;j++)
            {
                sum=sum+a[j];
                if(max<sum)
                {
                    max=sum;
                }
            }
        }
        System.out.println(max);
    }
}
