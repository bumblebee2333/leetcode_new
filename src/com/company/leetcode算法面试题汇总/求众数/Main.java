package com.company.leetcode算法面试题汇总.求众数;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

    }

    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        return nums[nums.length/2];
    }
}
