package com.company;

public class noofdigits {
    public static void main(String[] args) {
        int n=10,count=0;
        for(int i=1;i<=n;i=i*10)
        {
            count=count+(n-i+1);
        }
        System.out.println(count);

    }
}
