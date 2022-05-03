package com.company;
/*Given a set of numbers like <10, 36, 54,89,12> we want to find sum of weights based on the following conditions
        1. 5 if a perfect square
        2. 4 if multiple of 4 and divisible by 6
        3. 3 if even number

        And sort the numbers based on the weight and print it as follows

        <10,its_weight>,<36,its weight><89,its weight>*/
import java.util.Arrays;

public class setweight {
    public static void main(String[] args) {
        int[] a={10, 36, 54,89,12};

        Arrays.sort(a);
        int[] wei=new int[a.length];
        for(int i=0;i<a.length;i++)
        {
            wei[i]=0;
            int sq=(int) Math.sqrt(a[i]);
            if((sq*sq)==a[i])
            {
                wei[i]=wei[i]+5;
            }
            if(a[i]%4==0 && a[i]%6==0)
            {
                wei[i]=wei[i]+4;
            }
            if(a[i]%2==0)
            {
                wei[i]=wei[i]+3;
            }
        }

        for(int i=0;i<a.length;i++)
        {
            System.out.print("<"+a[i]+","+wei[i]+"> ");
        }

    }
}