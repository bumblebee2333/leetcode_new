package com.company.leetcode算法面试题汇总.旋转数组;

public class Main {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4};
        rotate(nums,3);
    }

    public static void rotate(int[] nums, int k) {
        k %= nums.length;
        reverse(nums, 0, nums.length - 1);
        reverse(nums, 0, k - 1);
        reverse(nums, k, nums.length - 1);

        for(int i=0;i<nums.length;i++){
            System.out.print(nums[i]+" ");
        }
    }
    public static void reverse(int[] nums, int start, int end) {
        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }

//    public static void rotate(int[] nums, int k) {
//         int[] flag = new int[k];
//         int s=0;
//         if(nums.length == 1){
//
//         }else if(nums.length == 2){
//             int temp = nums[0];
//             nums[0] = nums[1];
//             nums[1] = temp;
//         }else {
//             for(int i= nums.length-k;i<nums.length;i++){
//                 flag[s++] = nums[i];
//             }
//
//             for(int i= nums.length-1;i>=nums.length-k-1;i--){
//                 nums[i] = nums[i-k];
//             }
//
//             for(int i=0;i<k;i++){
//                 nums[i] = flag[i];
//             }
//         }
//         for(int i=0;i<nums.length;i++){
//             System.out.println(nums[i]+" ");
//         }
//    }
}
