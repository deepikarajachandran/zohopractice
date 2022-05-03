package com.company;

public class reverseletters {
    public static void main(String[] args) {
        String s="the sky is blue";
        char[] ch=s.toCharArray();

        int start=0,end= ch.length-1;
        while(start<end)
        {
            char temp=ch[start];
            ch[start]=ch[end];
            ch[end]=temp;

            start++;
            end--;
        }
        System.out.println(String.valueOf(ch));

    }
}
