package com.company.leetcode算法面试题汇总;

import java.util.Arrays;

/**
 * 2019/10/7 求众数
 */

public class Main1 {
    public static void main(String[] args) {
        int[] nums = {2,2,1,1,2,2};
        System.out.println(Main1.majorityElement(nums));
    }

    public static int majorityElement(int[] nums) {
        int a = nums[0];
        int count = 1;
        for(int num : nums) {
            if(num == a) {
                count ++;
            }else {
                count --;
                if(count == 0) {
                    a = num;
                    count = 1;
                }
            }
        }
        return a;
    }
}
