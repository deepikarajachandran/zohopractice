package com.company;

public class squarenumber {
    public static void main(String[] args) {
        int a=20,b=200;
        int sqr=1;
        for(int i=1;i<200;i++)
        {
            sqr=i*i;
            if(sqr>a && sqr<=b)
            {
                System.out.println(sqr);
            }

        }
    }
}
