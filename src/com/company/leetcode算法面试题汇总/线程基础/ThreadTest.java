package com.company.leetcode算法面试题汇总.线程基础;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;

public class ThreadTest extends Thread{

    private static int i=0;
    private static final Object LOCK = new Object();
    private int threadNumber = 0;
    private int threadCount;
    private int max;

    public ThreadTest(int threadNumber,int threadCount,int max){
        this.threadNumber = threadNumber;
        this.threadCount = threadCount;
        this.max = max;
    }
    public static void main(String[] args) {
        int threadCount = 3;
        int max = 100;
        for(int i=0;i<threadCount;i++){
            new ThreadTest(i,threadCount,max).start();
        }
    }



    @Override
    public void run() {
        while (true){
            synchronized (LOCK){
                //判断是否轮到当前线程执行
                while (i % threadCount != threadNumber){
                    if(i > max){
                        break;
                    }
                    try {
                        LOCK.wait();
                    }catch (InterruptedException e){
                        e.printStackTrace();
                    }
                }

                if(i > max){
                    break;
                }
                System.out.println("thread-"+threadNumber+":"+i);
                i++;
                LOCK.notifyAll();
            }
        }
    }
}
