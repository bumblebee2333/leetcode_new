package com.company.leetcode算法面试题汇总.反转字符串;

public class Main {
    public static void main(String[] args) {
        char[] s = {'h','e','l','l','o'};
        reverseString(s);
        for(int i=0;i<s.length;i++){
            System.out.print(s[i] + ' ');
        }
    }

    public static void reverseString(char[] s) {
        char temp;
        for(int i=0;i<s.length/2;i++){
            temp = s[i];
            s[i] = s[s.length-1-i];
            s[s.length-1-i] = temp;
        }
    }
}
