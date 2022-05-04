package com.company;
/*
Input :  arr[] =  {2, 5, 8, 4, 6, 11}, sum = 13
Output :
5 8
2 11
2 5 6
 */
public class subsetsum {
    public static void main(String[] args) {
        int[] a={2, 5, 8, 4, 6, 11};
        int sum=13;
        for(int i=0;i<a.length;i++)
        {
            for(int j=i+1;j<a.length;j++)
            {
                if((a[i]+a[j])==sum)
                {
                    System.out.println(a[i]+" "+a[j]);
                }
                for(int k=j+1;k< a.length;k++)
                {
                    if((a[i]+a[j]+a[k])==sum)
                    {
                        System.out.println(a[i]+" "+a[j]+" "+a[k]);
                    }
                }
            }
        }
    }
}
