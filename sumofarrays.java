package com.company;

import java.util.Arrays;
/*
Input:
Number of digits:12
9 2 8 1 3 5 6 7 3 1 1 6
Number of digits:9
7 8 4 6 2 1 9 9 7
Output :
9 2 8 9 2 0 2 9 5 1 1 3

 */
public class sumofarrays {
    public static void main(String[] args) {
        char[] ch={'9','2', '8', '1', '3', '5', '6', '7', '3', '1', '1', '6'};
        char[] ch2={'7', '8', '4', '6', '2', '1', '9', '9', '7'};
        String n1=String.copyValueOf(ch);
        String n2=String.copyValueOf(ch2);
        System.out.println(n1);
        System.out.println(n2);
        Long l1=Long.parseLong(n1);
        Long l2=Long.parseLong(n2);
        Long sum=l1+l2;
        System.out.println("long-"+sum);
        String s=String.valueOf(sum);
        System.out.println("String-"+s);
        char[] sums=s.toCharArray();
        System.out.println("array-"+ Arrays.toString(sums));

    }
}
