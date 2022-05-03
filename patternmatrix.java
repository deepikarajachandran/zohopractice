package com.company;
/*
You’re given an even number n. If n=4, you have to print the following pattern :
4444
4334
4334
4444
If n=6, then the pattern should be like this :
666666
655556
654456
654456
655556
666666

 */

public class patternmatrix {
    public static void main(String[] args) {
        int n=6;
        int[][] a=new int[n][n];
        int start=0,end=n;
        int s=0,e=n;
        while(start<end)
        {
            for(int i=s;i<e;i++)
            {
                for(int j=s;j<e;j++)
                {
                    if(i==s||j==s||i==e-1||j==e-1)
                    {
                        a[i][j]=n;
                    }
                }
            }
            start++;
            s++;
            end--;
            e--;
            n--;
        }

        for (int[] arr : a) {
            for (int j = 0; j < a[0].length; j++) {
                System.out.print(arr[j]);
            }
            System.out.println();
        }
    }
}
