package com.company.leetcode算法面试题汇总;

/**
 * 合并两个有序数组
 * 哎 好菜 这道题做了半天 刚开始就是从前往后想，考虑的情况不是全面的
 * 从后往前使用了0ms
 */

public class Main3 {
    public static void main(String[] args) {
        int[] nums1 = {4,5,6,0,0,0};
        int m = 3;
        int[] nums2 = {1,2,3};
        int n = 3;
        merge(nums1,m,nums2,n);
    }

    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int i=m-1,j=n-1;
        int length = m+n-1;
        while (i>=0 && j>=0){
            if(nums1[i] >= nums2[j]){
                nums1[length--] = nums1[i--];
            }else {
                nums1[length--] = nums2[j--];
            }
        }

        while (j>=0){
            nums1[length--] = nums2[j--];
        }

        for(int s=0;s<nums1.length;s++){
            System.out.println(nums1[s]+" ");
        }
    }
}
