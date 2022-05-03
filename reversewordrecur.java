package com.company;

public class reversewordrecur {
    public static String reverse(String s)
    {
        int ind=s.indexOf(" ");
        if(ind==-1)
        {
            return s;
        }

        return reverse(s.substring(ind+1)) +" "+ s.substring(0,ind); // recurse only substring(ind+1)

    }
    public static void main(String[] args) {
        String str="the sky is blue";
        System.out.println(str.toString());

        String rev=reverse(str);
        System.out.println(rev.toString());
    }
}
