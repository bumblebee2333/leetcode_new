package com.company.leetcode算法面试题汇总.无重复字符的最长子串;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        System.out.println(lengthOfLongestSubstring("pwwkew"));
    }

//    public static int lengthOfLongestSubstring(String s) {
//        int max;
//        int len = 0;
//        int maxLength = 0;
//        HashMap<Character,Integer> map = new HashMap<>();
//        for(int j=0;j<s.length();j++){
//            max = 0;
//            len = 0;
//            for(int i=j;i<s.length();i++){
//                if(map.containsKey(s.charAt(i))){
//                    map.put(s.charAt(i),map.get(s.charAt(i))+1);
//                    max = 1;
//                }else {
//                    map.put(s.charAt(i),1);
//                    ++max;
//                }
//                len = Math.max(max,len);
//            }
//            maxLength = Math.max(maxLength,len);
//            map.clear();
//        }
//        return maxLength;
//    }

    public static int lengthOfLongestSubstring(String s) {
        int n = s.length();
        Set<Character> set = new HashSet<>();
        int ans = 0, i = 0, j = 0;
        while (i < n && j < n) {
            // try to extend the range [i, j]
            if (!set.contains(s.charAt(j))){
                set.add(s.charAt(j++));
                ans = Math.max(ans, j - i);
            }
            else {
                set.remove(s.charAt(i++));
            }
        }
        return ans;
    }
}
