package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class rotatematrix {
    public static void rotate(int[][] mat)
    {
        int p= mat.length;
        int q=mat[0].length;
        for(int i=0;i<p;i++)
        {
            for(int j=i;j<q;j++)
            {
                int temp;
                temp=mat[i][j];
                mat[i][j]=mat[j][i];
                mat[j][i]=temp;
            }
        }
        for(int j=0;j<p;j++)
        {
            int start=0;
            int end=p-1;
            while(start<end)
            {
                int temp;
                temp=mat[j][start];
                mat[j][start]=mat[j][end];
                mat[j][end]=temp;

                start++;
                end--;
            }
        }
        System.out.println(Arrays.deepToString(mat));

    }
    public static void main(String[] args) {
        System.out.println("Enter n*n");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[][] matrix=new int[n][n];
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                matrix[i][j]= sc.nextInt();
            }
        }
        System.out.println(Arrays.deepToString(matrix));
        for(int x=0;x<4;x++)//for 360 degree rotation
        {
            rotate(matrix);
        }


    }
}
