package com.company;

import java.util.ArrayList;

public class operatorstring {
    public static void main(String[] args) {
        String str="5321*+-";
        ArrayList num=new ArrayList();
        ArrayList sym=new ArrayList();
        for(int i=0;i<str.length();i++)
        {
            if(str.charAt(i)>='1' && str.charAt(i)<='9')
            {
                int temp=str.charAt(i) - '0';
                num.add(temp);
            }
            else
            {
                sym.add(str.charAt(i));
            }
        }
        System.out.println(num);
        System.out.println(sym);

        int result=(int)num.get(0);

        int k=1;
        for(int i=0;i< sym.size();i++)
        {
            char temp=(char)sym.get(i);
            if(temp=='+')
            {
                result=result+(int)num.get(k++);
            }
            else if(temp=='-')
            {
                result=result-(int)num.get(k++);
            }
            else if(temp=='*')
            {
                result=result*(int)num.get(k++);
            }

        }
        System.out.println(result);
    }
}
