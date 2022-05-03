package com.company;

import java.util.Scanner;
/*
Given two binary numbers add the two numbers in binary form without converting them to decimal value.
eg) a = 1010 b = 11001
      o/p  100011

 */

public class binaryadd {
    public static void main(String[] args) {
      String str,str2;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter values ");
        str=sc.next();
        str2=sc.next();

            int a=Integer.parseInt(str,2);
            int b=Integer.parseInt(str2,2);
            int sum=a+b;

        String binsum=Integer.toBinaryString(sum);
        System.out.println(binsum);

    }
}
