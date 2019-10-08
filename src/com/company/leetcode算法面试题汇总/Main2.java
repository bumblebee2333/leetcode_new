package com.company.leetcode算法面试题汇总;

/**
 * 搜索二维矩阵
 * 本题思路：这道题自己想的很复杂，通过一行行的筛选，从每行的最后一个开始，小就行减一，大就列减一
 */
public class Main2 {
    public static void main(String[] args) {

    }

    public static boolean searchMatrix(int[][] matrix, int target) {
        if(matrix == null)
            return false;
        int x = matrix.length;//横向长度 5
        if(x == 0)
            return false;
        int y = matrix[0].length;//纵向长度 5
        if(y == 0)
            return false;

        int row = 0;
        int col = y-1;
        if(target < matrix[0][0] || target > matrix[x-1][y-1])
            return false;
        while (row < x && col >= 0){
            if(matrix[row][col] == target){
                return true;
            }else if(matrix[row][col] > target){
                col--;
            }else {
                row++;
            }
        }
        return false;
    }
}
