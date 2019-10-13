package com.company.leetcode算法面试题汇总.分割回文串;

import java.util.ArrayList;
import java.util.List;

/**
 * 费了老大劲了 太不容易了
 * 以后多练吧
 */
public class Main2 {
    public static void main(String[] args) {

    }
}

class Solution1 {
    /*
     * @param s: A string
     * @return: A list of lists of string
     */
    public List<List<String>> partition(String s) {
        // write your code here
        List<List<String>> res = new ArrayList<>();
        List<String> list = new ArrayList<>();

        int n = s.length();
        dfs(res, list, s, 0);
        return res;
    }

    public void dfs(List<List<String>> res, List<String> list, String s, int start){
        if(start == s.length()){
            res.add(new ArrayList(list));
            return;
        }
        for(int i = start; i < s.length(); i++){
            String sub = s.substring(start, i + 1);
            if(!isPal(sub)) continue;
            list.add(sub);
            dfs(res, list, s, i + 1);
            list.remove(list.size() - 1);
        }
    }

    public boolean isPal(String s) {
        int left = 0, right = s.length() - 1;
        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
