package com.company.leetcode算法面试题汇总.字符串转换整数;

public class Main {
    public static void main(String[] args) {
        System.out.println(myAtoi(" "));
    }

    public static int myAtoi(String str) {
        if(str == null){
            return 0;
        }
        str = str.trim();
        if(str.length() == 0){
            return 0;
        }
        char c = str.charAt(0);
        if ((c > '9' || c < '0') && c != '+' && c != '-') {
            return 0;
        }
        StringBuilder sb = new StringBuilder();
        char[] arr = str.toCharArray();
        sb.append(arr[0]);
        for(int i=1;i<arr.length;i++){
            if(arr[i] < '0' || arr[i] > '9'){
                break;
            }
            sb.append(arr[i]);
        }

        String s = sb.toString();
        if(s.length() == 1 && (s.charAt(0) == '+' || s.charAt(0) == '-')){
            return 0;
        }
        try {
            return Integer.valueOf(s);
        }catch (Exception e){
            return s.charAt(0) == '-' ? Integer.MIN_VALUE : Integer.MAX_VALUE;
        }
    }
}
