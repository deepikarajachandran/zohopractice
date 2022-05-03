package com.company;
/*
N = 5, S = 12
A[] = {1,2,3,7,5}
Output: 2 4
Explanation: The sum of elements
from 2nd position to 4th position
is 12.
---------------------------------------
Input:
N = 10, S = 15
A[] = {1,2,3,4,5,6,7,8,9,10}
Output: 1 5
Explanation: The sum of elements
from 1st position to 5th position
is 15.
 */

public class subarraysum {
    public static void main(String[] args) {
        int[] a={1,2, 3, 7, 5};
        int s=12;

        for(int i=0;i< a.length;i++)
        {
            int sum=a[i];
            for(int j=i+1;j< a.length;j++)
            {
                sum=sum+a[j];
                if(sum==s)
                {
                    System.out.println(i+" "+ j);
                    break;
                }
            }
        }


    }
}
