package com.company;

public class numpalindrome {
    public static void main(String[] args) {
        int num=39;
        int n=num,remainder;
        int rev=0;
       // int rev=(num%10)*10 + (num/10);

        while (n != 0) {
            remainder = n % 10;
            rev = rev * 10 + remainder;
            n /= 10;
        }

        int pal=num+rev;
        if(checkpalin(pal))
        {
            System.out.println("it is palindrome");
        }
        else
        {
            System.out.println("it is not a palindrome");
        }
    }
    public static boolean checkpalin(int c)
    {
        //int rev=(c%10)*10 + (c/10);
        int n=c;
        int rem=0,rev=0;
        while(n!=0)
        {
            rem=n%10;
            rev=rev*10+rem;
            n=n/10;
        }

        return rev == c;
    }
}
