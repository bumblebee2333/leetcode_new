package com.company.leetcode算法面试题汇总.有效的字母异位;

public class Main {
    public static void main(String[] args) {
        String s = "rat";
        String t = "car";
        System.out.println(isAnagram(s,t));
    }

    public static boolean isAnagram(String s, String t) {
        int[][] result = new int[26][2];
        char[] s1 = s.toCharArray();
        char[] t1 = t.toCharArray();
        for(int i=0;i<s1.length;i++){
            result[s1[i]-'a'][0]++;
        }

        for(int i=0;i<t1.length;i++){
            result[t1[i]-'a'][1]++;
        }

        for(int i=0;i<result.length;i++){
            if(result[i][0] != result[i][1]){
                return false;
            }
        }
        return true;
    }
}
