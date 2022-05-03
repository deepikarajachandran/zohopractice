package com.company;

/*
Given bigger NxN matrix and a smaller MxM matrix
print TRUE if the smaller matrix can be found in the bigger matrix else print FALSE
 */


import java.util.Scanner;

public class smallbigmatrix {


    public static void main(String[] args) {
        int[][] a=new int[50][50];
        int[][] b=new int[50][50];
        Scanner sc=new Scanner(System.in);

        int m=3,n=3;
        int c=2,d=2;

        System.out.println("enter 1st matrix ");
        for (int i = 0; i < m; i++)
            for (int j = 0; j < n; j++)
                a[i][j] = sc.nextInt();
        System.out.println("enter 2nd matrix ");
        for (int i = 0; i < c; i++)
            for (int j = 0; j < d; j++)
                b[i][j] = sc.nextInt();

        int k,p = 0;
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(a[i][j]==b[0][0])
                {
                  //  exit:
                    for(k=0;k<c;k++)
                    {
                        for(p=0;p<d;p++)
                        {
                            if(a[i+k][j+p]!=b[k][p])
                            {
                                break ;
                            }
                        }
                    }
                    if(k==c && p==d)
                    {
                        System.out.println("true");
                        int x=(i+k-1);
                        int y=(j+p-1);
                        System.out.println("from "+i+","+j+" to "+x+","+y);
                        return;
                    }
                }
            }
        }
        System.out.println("false");
    }
}
