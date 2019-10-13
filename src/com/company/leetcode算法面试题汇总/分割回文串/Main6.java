package com.company.leetcode算法面试题汇总.分割回文串;

import java.util.ArrayList;
import java.util.List;

/**
 * 分割回文串
 */
public class Main6 {
    public static void main(String[] args) {
        String s = "cbbbcc";
        List<List<String>> res = partition(s);
        for(int i=0;i<res.size();i++){
            System.out.println(res.get(i));
        }
    }

    public static List<List<String>> partition(String s) {
        List<List<String>> res = new ArrayList<>();
        List<String> list = null;
        //i控制步长
        for(int i=1;i<=s.length();i++){
            for(int j=0;j<s.length();j++){
                String sub;
                if(j+i<=s.length()){
                    sub = s.substring(j,j+i);
                }else {
                    break;
                }
                if(isPhraseString(sub)){
                    list = new ArrayList<>();
                    //list.add(sub);
                    addString(res,list,j,s,i,sub);
                    if(i==1)
                        break;
                }else {
                    continue;
                }
            }
        }
        return res;
    }

    public static void addString(List<List<String>> res,List<String> list,int flag,String s,int step,String sub){
        for(int i=0;i< s.length();i++){
            if(i == flag){
                list.add(sub);
                i += step;
                i--;
                continue;
            }
            String sb = s.substring(i,i+1);
            list.add(sb);
        }
        res.add(list);
    }

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

//    public static List<List<String>> partition(String s) {
//        List<List<String>> res = new ArrayList<>();
//        List<String> list = null;
//        //i控制步长
//        for(int i=1;i<=s.length();i++){
//            for(int j=0;j<s.length();j++){
//                String sub;
//                if(j+i<=s.length()){
//                    sub = s.substring(j,j+i);
//                }else {
//                    break;
//                }
//                if(isPhraseString(sub)){
//                    list = new ArrayList<>();
//                    //list.add(sub);
//                    //addString(res,list,j,s,i,sub);
//                    if(i==1){
//                        addString(res,list,j,s,i,sub);
//                        break;
//                    }
//                    else {
//                        List<String> lists = addHeadString(j,sub,s);
//                        restPalindrome(res,lists,s.substring(j+i,s.length()));
//                    }
//                }else {
//                    continue;
//                }
//            }
//        }
//        return res;
//    }
//
//    public static void restPalindrome(List<List<String>> res,List<String> list,String s){
//        for(int i=1;i<=s.length();i++){
//            for(int j=0;j<s.length();j++){
//                String sub;
//                if(j+i<=s.length()){
//                    sub = s.substring(j,j+i);
//                }else {
//                    break;
//                }
//                if(isPhraseString(sub)){
//                    //list.add(sub);
//                    addString(res,list,j,s,i,sub);
//                    if(i==1)
//                        break;
//                }else {
//                    continue;
//                }
//            }
//        }
//    }
//
//    public static void addString(List<List<String>> res,List<String> list,int flag,String s,int step,String sub){
//        for(int i=0;i< s.length();i++){
//            if(i == flag){
//                list.add(sub);
//                i += step;
//                i--;
//                continue;
//            }
//            String sb = s.substring(i,i+1);
//            list.add(sb);
//        }
//        res.add(list);
//    }
//
//    public static List<String> addHeadString(int end,String sub,String s){
//        List<String> list = new ArrayList<>();
//        for(int i=0;i<end;i++){
//            list.add(s.substring(i,i+1));
//        }
//        list.add(sub);
//        return list;
//    }
//
//    public static boolean isPhraseString(String s){
//        char[] ch = s.toCharArray();
//        if(ch.length == 1)
//            return true;
//        int k = s.length()-1;
//        for(int i=0;i<s.length()/2;i++){
//            if(ch[i] == ch[k-i]){
//                continue;
//            }else {
//                return false;
//            }
//        }
//        return true;
//    }
}
