package com.company;

public class lowertriangle {
    public static void main(String[] args) {
        int[][] arr={{4,0,0,0},
                     {8,3,0,0},
                     {9,7,3,0},
                     {5,5,9,8}};
        int i,j;
        int flag=0;
        for(i=0;i<arr.length;i++)
        {
            for(j=i+1;j< arr[i].length;j++)
            {
                if(arr[i][j]==0)
                {
                    flag=1;
                }
                else
                {
                    flag=0;
                    break;
                }
            }
            if(flag==0)
            {
                break;
            }
       }
        if(flag==1)
        {
            System.out.println("lower triangle");
        }
        else
        {
            System.out.println("not a lower");
        }
    }
}
