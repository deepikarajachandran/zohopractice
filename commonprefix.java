package com.company;

import java.util.Arrays;

/*
Write a function to find the longest common prefix string amongst an array of strings.
If there is no common prefix, return an empty string.
Example1 :
Input : strs = ["flower","flow","flight"]
output : "fl"
Example 2:
Input : strs = ["dog","racecar","car"]
output : ""

 */
public class commonprefix {
    public static void main(String[] args) {
        String[] str={"geeksforgeeks", "geeks", "geek", "geezer"};
        int n= str.length;
        Arrays.sort(str);
        int i=0;
       while(i<n && str[0].charAt(i) == str[n-1].charAt(i) )
       {
           i++;
       }
       if(i==0)
       {
           System.out.println(" ");
       }
       else
       {
           String str2=str[0].substring(0,i);
           System.out.println(str2);
       }

    }
}
