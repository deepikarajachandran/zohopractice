package com.company;

import java.util.ArrayList;

public class longsubarray {
    public static void main(String[] args) {
        int[] arr={10,22,9,33,21,50,41};
        ArrayList<Integer> al=new ArrayList<>();
        for(int i=0;i< arr.length;i++)
        {
            ArrayList<Integer> newal=new ArrayList<>();
            for(int j=i+1;j< arr.length;j++)
            {
                if(arr[i]<arr[j])
                {
                    newal.add(arr[i]);
                }
            }
            al=newal;
        }
        System.out.println(al);
    }
}
