package com.company.f020;

import javax.swing.table.TableRowSorter;
import java.util.EmptyStackException;
import java.util.Stack;

public class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        if (s.length()==0)
        {
            return true;
        }
        for (char right:s.toCharArray())
        {
            if (!filter(right,"{}[]()"))
            {
                continue;
            }
            char left;
            try {
                 left = stack.pop();
            }catch ( EmptyStackException e)
            {
                stack.push(right);
                continue;
            }

            if (!couple(left,right))
             {
                if (left(left)&&!left(right))
                {
                    return false;
                }
                stack.push(left);
                stack.push(right);
            }
        }
        if (stack.isEmpty())
        {
            return true;
        } else {
            return false;
        }

    }


    public boolean filter(char ch,String s) {
        if (s.contains(String.valueOf(ch)))
        {
            return true;
        }
        return false;
    }

    private boolean couple(Character pop, char ch) {
        if (('{'==pop&&'}'==ch)
            ||('('==pop&&')'==ch)
            ||('['==pop&&']'==ch)) {
            return true;
        }
        return false;
    }

    private boolean left(char ch)
    {
        if (filter(ch,"{[("))
        {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
    Solution solution = new Solution();
    String inputChar= "()";
    System.out.println(solution.isValid(inputChar));
    }
}
