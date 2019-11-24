package com.company.leetcode算法面试题汇总.存在重复元素;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] nums = {1,2,3,1};
        System.out.println(containsDuplicate(nums));
    }

    public static boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums);
        if(nums.length == 1 || nums.length == 0)
            return false;
        int number = nums[0];
        for(int i=1;i<nums.length;i++){
            if(nums[i] == number){
                return false;
            }else {
                number = nums[i];
            }
        }
        return true;
    }
}
