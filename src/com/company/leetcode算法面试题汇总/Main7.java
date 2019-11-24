package com.company.leetcode算法面试题汇总;

public class Main7 {
    public static void main(String[] args) {
        int n=55;
        n=n-1;
        n |= n >>> 1;
        n |= n >>> 2;
        n |= n >>> 4;
        n |= n >>> 8;
        n |= n >>> 16;
        System.out.println("n:"+n);
        //System.out.println("m:"+m);
    }
}
