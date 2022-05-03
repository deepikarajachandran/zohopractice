package com.company;

import java.util.ArrayList;

public class longestconseq {
    public static void main(String[] args) {
        int[] a={10,22,9,33,21,50,41,60,80};
        ArrayList<Integer> first=new ArrayList<>();
        int max=Integer.MIN_VALUE;
        for(int i=0;i<a.length;i++)
        {
            ArrayList<Integer> second=new ArrayList<>();
            for(int j=i;j<a.length;j++)
            {
                if(max<a[j])
                {
                    max=a[j];
                    second.add(a[j]);

                }
            }
            if(second.size()>first.size())
            {
                first=second;

            }
        }
        System.out.println(first);
    }
}
