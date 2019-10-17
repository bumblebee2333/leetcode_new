package com.company.leetcode算法面试题汇总.单词拆分;

import java.util.ArrayList;
import java.util.List;

/**
 * 单词拆分1
 */
public class Main {
    public static void main(String[] args) {
        String s = "catsanddog";
        List<String> wordDict = new ArrayList<>();
        wordDict.add("cats");
        wordDict.add("dog");
        wordDict.add("sand");
        wordDict.add("cat");
        boolean is = wordBreak(s,wordDict);
        System.out.println(is);
    }


    public static boolean wordBreak(String s, List<String> wordDict) {
        boolean[] dp = new boolean[s.length()+1];//这个数组是为了当截断字符串时首尾必须不重复
        dp[0] = true;
        for(int i=1;i<=s.length();i++){
            for(int j=0;j<i;j++){
                String str = s.substring(j,i);
                if(wordDict.contains(str) && dp[j]){
                    dp[i] = true;
                    break;
                }
            }
        }
        return dp[s.length()];
    }
}
