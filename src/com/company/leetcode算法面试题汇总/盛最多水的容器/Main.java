package com.company.leetcode算法面试题汇总.盛最多水的容器;

public class Main {
    public static void main(String[] args) {
        int[] height = {2,3,4,5,18,17,6};
        System.out.println(maxArea(height));
    }

    public static int maxArea(int[] height) {
        int water = 0;
        int sum = 0;
        StringBuilder sb = new StringBuilder();
        int i=0,j=height.length-1;
        while(i<height.length){
            if(height[i]<=height[j]){
                sum = height[i] * (j-i);
                water = Math.max(sum,water);
                ++i;
            }else{
                sum = height[j] * (j-i);
                water = Math.max(sum,water);
                --j;
            }
        }
        return water;
    }
}
