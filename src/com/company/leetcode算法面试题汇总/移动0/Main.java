package com.company.leetcode算法面试题汇总.移动0;

public class Main {
    public static void main(String[] args) {
        int[] nums = {0,1,0,3,12};
        //moveZeroes(nums);
    }

    //超出时间限制
//    public static void moveZeroes(int[] nums) {
//        int datum = 0;
//        int count = 0;
//        int temp;
//        if(nums.length==0 || nums.length == 1){
//
//        }else {
//            for(int i=0;i<nums.length;i++){
//                if(nums[i] == 0){
//                    datum++;
//                }
//            }
//            while (true){
//                boolean flag = false;
//                for(int i=0;i<nums.length-1;i++){
//                    if(nums[i] == 0 && nums[i+1] != 0){
//                        temp = nums[i+1];
//                        nums[i+1] = nums[i];
//                        nums[i] = temp;
//                        flag = true;
//                    }else if(nums[i] != 0)
//                        continue;
//                }
//                if(flag)
//                    count++;
//                if(count == datum)
//                    break;
//            }
//        }
//        for(int j=0;j<nums.length;j++){
//            System.out.print(nums[j]+" ");
//        }
//    }

    public static void moveZeroes(){

    }
}
