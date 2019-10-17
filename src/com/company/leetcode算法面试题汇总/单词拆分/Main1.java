package com.company.leetcode算法面试题汇总.单词拆分;

import javax.swing.*;
import java.util.*;

/**
 * 单词拆分2
 */
public class Main1 {
    public static void main(String[] args) {
        String s = "catsanddog";
        List<String> list = new ArrayList<>();
        list.add("cat");
        list.add("cats");
        list.add("and");
        list.add("sand");
        list.add("dog");
        List<String> st;
        st = wordBreak(s,list);
        for(int i=0;i<st.size();i++){
            System.out.println(st.get(i));
        }
    }

    public static List<String> wordBreak(String s, List<String> wordDict) {
        return word_Break(s, wordDict, 0);
//        List<String> res = new ArrayList<>();
//        boolean[] dp = new boolean[s.length()+1];//这个数组是为了当截断字符串时首尾必须不重复
//        dp[0] = true;
//        for(int i=1;i<=s.length();i++){
//            for(int j=0;j<i;j++){
//                String str = s.substring(j,i);
//                if(wordDict.contains(str) && dp[j]){
//                    dp[i] = true;
//                    break;
//                }
//            }
//        }
//        if(!dp[s.length()]){
//            return null;
//        }
//
//        StringBuilder sb = new StringBuilder();
//        dfs(s,wordDict,sb,res,0);
//        return res;
    }

    public static List<String> word_Break(String s, List<String> wordDict, int start) {
        LinkedList<String> res = new LinkedList<>();
        if (start == s.length()) {
            res.add("");
        }
        for (int end = start + 1; end <= s.length(); end++) {
            String str = s.substring(start, end);
            if (wordDict.contains(str)) {
                List<String> list = word_Break(s, wordDict, end);
                for (String l : list) {
                    res.add(s.substring(start, end) + (l.equals("") ? "" : " ") + l);
                    System.out.println(l);
                }
            }
        }
        return res;
    }

//    private static void dfs(String s,List<String> wordDict,StringBuilder sb,List<String> res,int start){
//        if(start == s.length()){
//            res.add(sb.toString().trim());
//            return;
//        }
//
//        for(int i=start+1;i<=s.length();i++){
//            String str = s.substring(start,i);
//            if(wordDict.contains(str)){
//                int length = str.length();
//                sb.append(str).append(" ");
//                dfs(s,wordDict,sb,res,i);
//                sb.setLength(length);
//                System.out.println(sb.toString());
//            }
//        }
    }

