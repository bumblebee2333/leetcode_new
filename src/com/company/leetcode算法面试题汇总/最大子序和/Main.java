package com.company.leetcode算法面试题汇总.最大子序和;

public class Main {
    public static void main(String[] args) {
        int[] nums = {-2,-1,-3,-7,-1,-8,-1,-5,-4};
        System.out.println(maxSubArray2(nums));
    }

    //动态规划
    public static int maxSubArray(int[] nums) {
        int[] dp = new int[nums.length];
        dp[0] = nums[0];
        int result = Integer.MIN_VALUE;
        for(int i=1;i<nums.length;i++){
            dp[i] = Math.max(dp[i-1]+nums[i],nums[i]);
            result = Math.max(dp[i],result);
        }
        return result;
    }

    public static int maxSubArray2(int[] nums){
        int result = Integer.MIN_VALUE;
        int[] dp = new int[nums.length];
        dp[0] = nums[0];
        int sum = 0;
        for(int i=0;i<nums.length;i++){
            sum += nums[i];
            result = Math.max(result,sum);
            if(sum< 0){
                sum = 0;
            }
        }
        return result;
    }
}
