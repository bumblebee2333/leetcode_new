package com.company.leetcode算法面试题汇总.按序打印;

import com.company.leetcode算法面试题汇总.线程基础.ThreadTest;

public class Main {
    public static void main(String[] args) {

    }

    class ThreadA extends Thread{
        @Override
        public void run() {
            System.out.println("one");
        }
    }

    class ThreadB extends Thread{
        @Override
        public void run() {
            System.out.println("threa");
        }
    }

    class ThreadC extends Thread{
        @Override
        public void run() {
            super.run();
        }
    }
}
