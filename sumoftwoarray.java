package com.company;

import java.util.Arrays;

public class sumoftwoarray {
    public static void main(String[] args) {
        String str="1 2 3";
        str=str.replace(" ","");
        System.out.println(str);
        String str1="3 3 5 2 7";
        str1=str1.replace(" ","");
        System.out.println(str1);

        Long s1=Long.parseLong(str);
        Long s2=Long.parseLong(str1);

        Long sum=s1+s2;
        System.out.println(sum);
        String str3=sum.toString();
        char[] ch=str3.toCharArray();
        System.out.println(Arrays.toString(ch));

    }
}
