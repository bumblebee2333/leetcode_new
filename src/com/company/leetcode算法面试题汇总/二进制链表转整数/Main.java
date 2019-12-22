package com.company.leetcode算法面试题汇总.二进制链表转整数;

public class Main {
    public static void main(String[] args) {
        System.out.println(getDecimalValue());
    }

    public static int getDecimalValue() {
        int value= 0,j=0;
        StringBuilder sb = new StringBuilder("101");
//        ListNode p = head;
//        while(p.next != null){
//            sb.append(String.valueOf(p.next.val));
//            p = p.next;
//        }
        String s = sb.toString();
        char[] str = s.toCharArray();
        for(int i=str.length-1;i>=0;i--){
            if(s.charAt(i) == '1'){
                value += Math.pow(2,j);
            }
            j++;
        }
        return value;
    }
}

class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
}
