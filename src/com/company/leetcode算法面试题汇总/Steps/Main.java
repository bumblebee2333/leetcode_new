package com.company.leetcode算法面试题汇总.Steps;

public class Main {
    public static void main(String[] args) {
        System.out.println(jumpSteps(5));
    }

    public static int jumpSteps(int n){
        if(n == 1)
            return 1;
        if(n==2)
            return 2;

        return jumpSteps(n-1)+jumpSteps(n-2);
    }
}
