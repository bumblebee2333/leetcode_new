package com.company.leetcode算法面试题汇总.寻找和为指定的两个数;

public class Main {
    public static void main(String[] args) {
        int[] num = {1,2,4,7,11,15};
        int sum = 15;
        int start = 0;
        int end = num.length-1;
        //采用两个指针夹逼的方法
        while (start < end){
            int count = num[start]+num[end];
            if(count == sum){
                System.out.println(num[start]+","+num[end]);
                break;
            }else {
                if(count<sum){
                    start++;
                }else {
                    end--;
                }
            }
        }
    }
}
