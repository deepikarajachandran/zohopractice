package com.company;

/*Program to check whether the given matrix is an upper triangular or lower triangular.
* Input:
 4 6 1 4
 0 3 5 9
 0 0 6 2
 0 0 0 8

 Output: Upper Triangular Matrix

 Input:
 1 0
 1 1
 Output: Lower Triangular Matrix
*/

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[][] arr={{4,6,1,4},
                     {0,3,5,9},
                     {0,0,6,2},
                     {0,0,0,8}};
        System.out.println(Arrays.deepToString(arr));
        int flag=0;
        for(int i=1;i< arr.length;i++)
        {
            for (int j=0;j < i;j++)
            {
                if(arr[i][j]==0)
                {
                    flag=1;
                }
                else
                {
                    flag=0;
                }
            }
            if(flag==0)
            {
                break;
            }
       }
    if(flag==1)
    {
        System.out.println("upper triangle");
    }
    else
    {
        System.out.println("not a upper triangle");
    }
    }
}
