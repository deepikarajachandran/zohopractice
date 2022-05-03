package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class horizontalmirror {
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
        int[][] temp=new int[n][n];
        for (int j = 0; j < n; j++) {
            for (int i = 0; i < n; i++) {
                temp[n-1-i][j] = matrix[i][j];
            }
        }
        System.out.println(Arrays.deepToString(temp));

    }
}
