package com.company.leetcode算法面试题汇总;

import java.util.HashMap;
import java.util.Map;

public class Main9 {
    public static void main(String[] args) {
        Map<Integer, Integer> map = new HashMap<>();
        for (Integer i = 0; i < 100; i++) {
            map.put(i, 100 - i);
            map.remove(i - 1);
        }
        System.out.println(map.size());
    }

}
