package com.company.leetcode算法面试题汇总.分割回文串;

import java.util.ArrayList;
import java.util.List;

public class Main1 {
    public static void main(String[] args) {

    }

//    public List<List<String>> partition(String s) {
//        List<List<String>> res = new ArrayList<>();
//        List<String> list = null;
//    }



    public static boolean isPhraseString(String s){
        char[] ch = s.toCharArray();
        if(ch.length == 1)
            return true;
        int k = s.length()-1;
        for(int i=0;i<s.length()/2;i++){
            if(ch[i] == ch[k-i]){
                continue;
            }else {
                return false;
            }
        }
        return true;
    }
}
