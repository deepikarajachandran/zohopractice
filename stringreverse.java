package com.company;

import java.util.Arrays;

/*
You’re given a string as an input. You have to reverse the string by keeping the punctuation and spaces.
You have to modify the source string itself with creating a string.
Input :A man, in the boat says : I see 1-2-3 in the sky
Output :
y kse, ht ni3 21ee slsy : a sta o-b-e ht nin amA

 */
public class stringreverse {
    public static void main(String[] args) {
        String str="house no : 123@ cbe";
        char[] ch=str.toCharArray();
        System.out.println(str);
        System.out.println(Arrays.toString(ch));
        int start=0,end= ch.length-1;
        while(start<end)
        {
            if(!Character.isLetterOrDigit(ch[start]))
            {
                start++;
            }
            else if(!Character.isLetterOrDigit(ch[end]))
            {
                end--;
            }
            else
            {
                char temp=ch[start];
                ch[start]=ch[end];
                ch[end]=temp;

                start++;
                end--;
            }
        }
        System.out.println(Arrays.toString(ch));
        System.out.println(String.valueOf(ch));
    }
}
