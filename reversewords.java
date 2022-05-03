package com.company;

public class reversewords {
    public static void main(String[] args) {
        String s="the sky is blue";
        String [] words = s.split(" ");
        StringBuilder sb = new StringBuilder();
        int end = words.length - 1;
        for(int i = 0; i<= end; i++)
        {
            if(!words[i].isEmpty())
            {
                sb.insert(0, words[i]);
                if(i < end)
                {
                    sb.insert(0, " ");
                }
            }
        }
        System.out.println(sb);
    }
}
