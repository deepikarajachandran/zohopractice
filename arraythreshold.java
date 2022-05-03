package com.company;
/*
3. Given an array and a threshold value find the o/p
eg) i/p {5,8,10,13,6,2};threshold = 3;
      o/p  count = 17
      explanation:
Number   	       parts	            counts
5	               {3,2}                 2
8                  {3,3,2}               3
10                 {3,3,3,1}             4
13                 {3,3,3,3,1}           5
6                  {3,3}                 2
2                  {2}                   1

 */

public class arraythreshold {
    public static void main(String[] args) {
        int[] a={1,2,5,9};
        int count=0,th=3;
        for(int i=0;i<a.length;i++)
        {
            int pair=0;
            pair=a[i]/th;
            if(a[i]%th!=0)
            {
                pair++;
                System.out.println("For "+a[i]+" count is "+pair);
            }
            else
            {
                System.out.println("For "+a[i]+" count is "+pair);
            }
            count=count+pair;

        }
        System.out.println("count is "+ count);
    }
}
