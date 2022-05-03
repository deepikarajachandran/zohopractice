package com.company;
/*
4.	A number is called as binary-decimal if all the digits in the number should be either ‘1’ or ‘0’.
Any number can be written as a sum of binary-decimals.
 Our task is to find the minimum number of binary-decimals to represent a number.Input : 32Output : 10 11 11
Input : 120
Output : 10 110

 */
public class decimalbinary {
    public static void main(String[] args) {
   /*  int n=51;
        int x=n%10;
        int y=n-11*x;
        int z=y/10;

        for(int i=0;i<x;i++)
        {
            System.out.println(11);
        }
        for(int i=0;i<z;i++)
        {
            System.out.println(10);
        }
      */
        int n=32;
        while(n>0)
        {
            int temp=n;
            int X=0,bit=1;
            while(temp!=0)
            {
                int last=temp%10;
                temp=temp/10;

                if(last!=0)
                {
                    X=X+bit;
                }
                bit=bit*10;
            }

            System.out.println(X);
            n=n-X;

        }
    }
}
