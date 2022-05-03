package com.company;

import java.util.HashSet;
import java.util.Set;
/* this code is print all substrings of a given string --------not to print subsequence
Input :  abcd
Output :  a
          b
          c
          d
          ab
          bc
          cd
          abc
          bcd
          abcd
          */
public class printsubstr {
    public static void main(String[] args) {
        String str="abcd";
        Set<String> hs=new HashSet<>();
        //System.out.println(str.substring(0,2));
        for(int i=0;i<str.length();i++)
        {
            for(int j=i+1;j<=str.length();j++)
            {
                //String res=str.substring(i,j);
                //hs.add(res);
                System.out.println(str.substring(i,j));

            }
        }
       // System.out.println(hs);
    }
}
