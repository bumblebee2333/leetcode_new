package com.company.leetcode算法面试题汇总.字符串中的唯一字符;

public class Main {
    public static void main(String[] args) {
        String s = "loveleetcode";
        System.out.println(firstUniqChar(s));
    }

    public static int firstUniqChar(String s) {
        int count = 0;
        char[] ch = s.toCharArray();
        int[] flag = new int[26];
        for(int i=0;i<ch.length;i++){
            flag[ch[i]-'a']++;
        }

        for(int i=0;i<ch.length;i++){
            if(flag[ch[i]-'a'] == 1)
                return i;
        }
        return -1;
    }
}
