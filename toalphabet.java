package com.company;

public class toalphabet {
    public static void main(String[] args) {
        int value=27;
        String result="";
        while (--value >= 0)
        {
            result = (char)('A' + value % 26 )+result;
            value /= 26;
        }
        System.out.println(result);
    }
}
