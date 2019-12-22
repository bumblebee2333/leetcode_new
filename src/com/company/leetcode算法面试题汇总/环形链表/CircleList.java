package com.company.leetcode算法面试题汇总.环形链表;

public class CircleList {
    public static void main(String[] args) {
        Circle circle = new Circle();
        ListNode head = circle.createList();
        circle.printList(head);
        System.out.println(circle.hasCycle(head));
    }

}

class Circle{
    public ListNode createList(){
        ListNode head = new ListNode();
        head.next = null;
        ListNode t = head;
        ListNode p = null;
        int i=0;
        int[] a = {3,2,0,-4};
        while (i<a.length){
            ListNode node = new ListNode(a[i]);
            ++i;
            if(node.val == -4){
                t.next = node;
                node.next = p;
            }else {
                node.next = t.next;
                t.next = node;
                t = node;
            }
            if(t.val == 2){
                p = t;
            }
        }
        return head;
    }

    public void printList(ListNode head){
        int i=1;
        ListNode p = head.next;
        while (p.next!=null){
             System.out.print(p.val+" ");
             p=p.next;
             i++;
             if(i>10)
                 break;
        }
    }

    public boolean hasCycle(ListNode head) {
        ListNode start = head;
        ListNode end = head;
        if(start==null){
            return false;
        }

        while(start.next != null && end.next.next != null){
            end = end.next.next;
            if(end == start){
                return true;
            }else{
                start = start.next;
            }
        }
        return false;
    }
}

class ListNode {
  int val;
  ListNode next;
  ListNode(){}
  ListNode(int x) {
      val = x;
      next = null;
  }
}
