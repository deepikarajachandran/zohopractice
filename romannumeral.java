package com.company;

public class romannumeral {
    public static int value(char ch)
    {
        if(ch=='I') return 1;
        else if(ch=='V') return 5;
        else if(ch=='X') return 10;
        else if(ch=='L') return 50;
        else if(ch=='C') return 100;
        else if(ch=='D') return 500;
        else if(ch=='M') return 1000;

        return -1;
    }
    public static void main(String[] args) {
        String s="MCMXCIV";
        int num=0;

        for(int i=0;i<s.length();i++)
        {
            int v1=value(s.charAt(i));
            if(i+1 < s.length())
            {
                int v2=value(s.charAt(i+1));
                if (v1 >= v2)
                {
                    num = num + v1;
                }
                else
                {
                    num = num - v1;
                }
            }
            else
            {
                num = num + v1;
            }
        }
        System.out.println(num);

    }
}
