package com.company;

/*Sort the array alternately i.e first element should be max value,
second min value, third second max, third second min.

eg: i/p 5,2,8,7,4,3,9
 o/p     9,2,8,3,7,4,5
Eg: arr[] = {1,2,3,4,5,6,7}
O/P: {7,1,6,2,5,3,4}

Note: no extra space and time complexity should be less;*/

import java.util.Arrays;

public class sortmaxmin {
    public static void main(String[] args) {
        int[] arr={5,2,8,7,4,3,9};

        Arrays.sort(arr);
        int last=arr.length-1;
        for(int i=0;i< arr.length;i=i+2)
        {

            if(arr[i]<arr[last])
            {
                int temp=arr[last];
                for(int j= last;j>i;j--)
                {
                    arr[j]=arr[j-1];
                }
                arr[i]=temp;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
