package com.company;

import java.util.Arrays;

public class vowelreverse {
    public static void main(String[] args) {
        String s="practice";
        char[] ch=s.toCharArray();
        int start=0,end= ch.length-1;
        while(start<end)
        {
            if(! (ch[start]=='a'||ch[start]=='e'||ch[start]=='i'||ch[start]=='o'||ch[start]=='u'))
            {
                start++;
               continue;
            }
            if(! (ch[end]=='a'||ch[end]=='e'||ch[end]=='i'||ch[end]=='o'||ch[end]=='u'))
            {
                end--;
               continue;
            }

            char temp=ch[start];
            ch[start]=ch[end];
            ch[end]=temp;

            start++;
            end--;
        }
        System.out.println(Arrays.toString(ch));
    }
}
