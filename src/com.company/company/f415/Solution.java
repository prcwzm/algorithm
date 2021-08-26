package com.company.f415;

import com.company.f051.Soution1;
import com.sun.nio.sctp.SendFailedNotification;

import java.util.Arrays;

import static java.lang.Math.abs;

public class Solution {
    public String addStrings(String num1, String num2) {
        char[] numChar = num1.toCharArray();
        char[] numChar2 = num2.toCharArray();
        boolean addFirst = false;
        int pace = numChar.length - numChar2.length>0?numChar.length - numChar2.length:numChar2.length - numChar.length;

        char[] newNum = numChar.length>numChar2.length?numChar:numChar2;
        char[] shortNum = numChar.length<=numChar2.length?numChar:numChar2;
        int begin = newNum.length - pace;
        if (newNum.length == shortNum.length && (newNum[0]+shortNum[0]-'0'>'9'))
        {
            addFirst = true;
        }
        if (newNum.length == shortNum.length && newNum.length>2 && (newNum[0]+shortNum[0]-'0'=='9'&& newNum[1]+shortNum[1]-'0'>'9')){
            addFirst = true;
        }
        if (newNum.length == (shortNum.length + 1) && newNum[1]+shortNum[0]-'0'>'9' &&newNum[0]=='9'){
            addFirst = true;
        }
        boolean addBefore = false;
        for (int i = 1; i<=shortNum.length; i++)
        {
            newNum[newNum.length-i] = (char) (newNum[newNum.length-i] + shortNum[shortNum.length-i] -'0'+ (addBefore?1:0));
            addBefore = false;
            if(newNum[newNum.length-i] + shortNum[shortNum.length-i] -'0'>'9')
            {
                newNum[newNum.length-i] = (char)((int)newNum[newNum.length-i]-10);
                addBefore = true;
            }
        }
        if (!addFirst&&addBefore&&newNum.length!=shortNum.length)
        {
            newNum[newNum.length-shortNum.length-1]= (char)((int)newNum[newNum.length-shortNum.length-1]+1);
            if(newNum[newNum.length-shortNum.length-1]>'9')
            {
                newNum[newNum.length-shortNum.length-1] = (char)((int)newNum[newNum.length-shortNum.length-1]-10);
            }
        }
    return addFirst?("1"+ String.valueOf(newNum)):String.valueOf(newNum);
    }

    public static void main(String[] args) {
        String num = "123";
        String num2 = "456";
        Solution  solution= new Solution();
        String newNumber = solution.addStrings(num,num2);
    }
}
