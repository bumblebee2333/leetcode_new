package com.company.leetcode算法面试题汇总.链表两数相加;

import java.awt.*;

public class Main {
    public static void main(String[] args) {
        Test test = new Test();
        ListNode head1 = test.createL1();
        ListNode head2 = test.createL2();
        test.print(head1);
        System.out.println();
        test.print(head2);
        System.out.println();
        ListNode head = test.addTwoNumbers(head1,head2);
        test.print(head);
    }


}

class Test{
    public ListNode createL1(){
        int[] a = {2,4,3};
        ListNode head1 = new ListNode(0);
        head1.next = null;
        ListNode t = head1;
        for(int i=0;i<a.length;i++){
            ListNode node = new ListNode(a[i]);
            node.next = t.next;
            t.next = node;
            t = node;
        }
        return head1;
    }

    public ListNode createL2(){
        int[] a = {5,6,4};
        ListNode head2 = new ListNode(0);
        head2.next = null;
        ListNode t = head2;
        for(int i=0;i<a.length;i++){
            ListNode node = new ListNode(a[i]);
            node.next = t.next;
            t.next = node;
            t = node;
        }
        return head2;
    }

    public void print(ListNode head){
        ListNode t = head;
        while (t.next!=null){
            System.out.print(t.next.val);
            t = t.next;
        }
    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode head1 = reserver(l1);
        ListNode head2 = reserver(l2);
        ListNode head3 = new ListNode(0);
        head3.next = null;
        ListNode p = head1.next;
        ListNode q = head2.next;
        ListNode t = head3;
        int carry = 0;//进位
        int data = 0;//当前结点的值
        while(p != null && q != null){
            data = p.val + q.val;
            if(data >= 10){
                int num = carry;
                carry = (data + carry) / 10;
                data = (data + num) % 10;
                ListNode node  = new ListNode(data);
                node.next = t.next;
                t.next = node;
                t = node;
            }else if(data < 10 && carry == 0){
                ListNode node  = new ListNode(data);
                node.next = t.next;
                t.next = node;
                t = node;
            }else if(data < 10 && carry > 0){
                data = data + carry;
                if(data >= 10){
                    int num = carry;
                    carry = (data + carry) / 10;
                    data = (data + num) % 10;
                    ListNode node  = new ListNode(data);
                    node.next = t.next;
                    t.next = node;
                    t = node;
                }else {
                    ListNode node  = new ListNode(data);
                    node.next = t.next;
                    t.next = node;
                    t = node;
                }
            }
            p=p.next;
            q=q.next;
        }

        if(carry > 0){
            ListNode node  = new ListNode(carry);
            node.next = t.next;
            t.next = node;
        }

        return head3;
    }

    public ListNode reserver(ListNode head){
        ListNode p = head.next;
        head.next = null;
        ListNode t = p;
        while(p != null){
            p = p.next;
            t.next = head.next;
            head.next = t;
            t = p;
        }
        return head;
    }
}

class ListNode{
    int val;
    ListNode next;
     public ListNode(int val){
         this.val = val;
     }
}
