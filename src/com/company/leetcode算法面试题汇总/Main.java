package com.company.leetcode算法面试题汇总;
/**
 * 2019/10/7 只出现一次的数字
 */
public class Main {
    public static void main(String[] args) {
        int nums[] = {1,2,1,2,4};
        Solution solution = new Solution();
        System.out.println(solution.singleNumber(nums));
    }

    static class Solution {
        public Solution(){}
        public int singleNumber(int[] nums) {
            int num = 0;
            int count = 1;
            for(int i=0;i<nums.length;i++){
                num = nums[i];
                for(int j=0;j<nums.length;j++){
                    if(j == i)
                        continue;
                    if(nums[j] == num)
                        count++;
                }
                if(count == 1)
                    break;
                else {
                    count = 1;
                }
            }
            return num;
        }
    }
}

