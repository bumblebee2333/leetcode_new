package com.company.leetcode算法面试题汇总.三数之和;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        int[] nums = {-4,-2,-2,-2,0,1,2,2,2,3,3,4,4,6,6};
        List<List<Integer>> res = threeSum(nums);
        System.out.println(res.size());
    }

//    public static List<List<Integer>> threeSum(int[] nums) {
//        int R = nums.length-1;
//        int L=0;
//        int sum = 0;
//        List<List<Integer>> res = new ArrayList<>();
//        List<Integer> list = new ArrayList<>();
//        if(nums == null || nums.length<3)
//            return res;
//        Arrays.sort(nums);
//        for(int i=0;i<nums.length;i++){
//            if(nums[i]>0)
//                break;
//            if(i>0 && nums[i] == nums[i-1])
//                continue;
//            L=i+1;
//            while (L<R){
//                sum = nums[L]+nums[R]+nums[i];
//                if(sum<0)
//                    L +=1;
//                else if(sum > 0)
//                    R -=1;
//                else {
//                    res.add(Arrays.asList(nums[i],nums[L],nums[R]));
//                    while (L<R && nums[L] == nums[L+1])
//                        L++;
//                    while (L<R && nums[R-1] == nums[R])
//                        R--;
//                    L++;
//                    R--;
//                }
//            }
//        }
//        return res;
//    }

    public static List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> ans = new ArrayList();
        int len = nums.length;
        if(nums == null || len < 3) return ans;
        Arrays.sort(nums); // 排序
        for (int i = 0; i < len ; i++) {
            if(nums[i] > 0) break; // 如果当前数字大于0，则三数之和一定大于0，所以结束循环
            if(i > 0 && nums[i] == nums[i-1]) continue; // 去重
            int L = i+1;
            int R = len-1;
            while(L < R){
                int sum = nums[i] + nums[L] + nums[R];
                if(sum == 0){
                    ans.add(Arrays.asList(nums[i],nums[L],nums[R]));
                    while (L<R && nums[L] == nums[L+1]) L++; // 去重
                    while (L<R && nums[R] == nums[R-1]) R--; // 去重
                    L++;
                    R--;
                }
                else if (sum < 0) L++;
                else if (sum > 0) R--;
            }
        }
        return ans;
    }
}
