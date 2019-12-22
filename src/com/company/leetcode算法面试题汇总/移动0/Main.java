package com.company.leetcode算法面试题汇总.移动0;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] nums = {0,1,0,3,0};
        moveZeroes(nums);
        for(int i=0;i<nums.length;i++){
            System.out.print(nums[i]);
        }
    }

    public static void moveZeroes(int[] nums){
        if(nums.length==0 || nums == null || nums.length == 1)
            return;

        int index = 0;
        for(int i=0;i<nums.length;i++){
            if(nums[i] != 0){
                nums[index] = nums[i];
                index += 1;
            }
        }

        for(int i=index;i<nums.length;i++){
            nums[index++] = 0;
        }
    }
}
