package com.company;

import java.util.ArrayDeque;

public class balanceparanthese {
    public static boolean check(String s)
    {
        ArrayDeque<Character> stack = new ArrayDeque<>();
        for (char c : s.toCharArray()) {
            if (c == '(')
                stack.push(')');
            else if (c == '{')
                stack.push('}');
            else if (c == '[')
                stack.push(']');
            else if (stack.isEmpty() || stack.pop() != c)
                return false;
        }
        return stack.isEmpty();

    }
    public static void main(String[] args) {
        String str="{(}";
        if(check(str))
        {
            System.out.println("balanced");
        }
        else
        {
            System.out.println("unbalanced");
        }

    }
}
