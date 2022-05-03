package com.company;
/*
Your code should also find if a given number cannot be converted to a mono digit number.
      Input     Output
    72581         7(2+5)81
                  77(8-1)
                  777
    3962          cannot create a mono digit number

 */
public class monodigit {
    public static void main(String[] args) {
        String s="72581";
        char[] ch=s.toCharArray();
        int sum=0;

        for(int i=0;i<s.length();i++)
        {
            int a=Integer.parseInt(String.valueOf(ch[0]));
            int b=Integer.parseInt(String.valueOf(ch[1]));
            if((a+b)==ch[i+2])
            {

            }

        }

    }
}
