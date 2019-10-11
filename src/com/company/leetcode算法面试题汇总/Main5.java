package com.company.leetcode算法面试题汇总;

/**
 * 字符串翻转
 */
public class Main5 {
    public static void main(String[] args) {
        String s = "a";
        if(isPalindrome(s)){
            System.out.println("true");
        }else {
            System.out.println("false");
        }
    }

    public static boolean isPalindrome(String s) {
        String str = s.replaceAll("[^a-zA-Z0-9]","");
        str = str.toLowerCase();
        if(str==null)
            return false;
        else if(str.length() == 1){
            return true;
        }
        char[] ch = str.toCharArray();
        int k = ch.length-1;
        for (int i=0;i<ch.length/2;i++){
            if(ch[i] == ch[k-i]){
                continue;
            }
            else {
                return false;
            }
        }
        return true;
    }
}
