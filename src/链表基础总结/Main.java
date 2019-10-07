package 链表基础总结;

import java.util.Scanner;

/**
 * 创建链表 链表的增删改查
 */
public class Main {
    public static void main(String[] args) {
        CreateLinkedList();
    }

    /**
     * 创建链表使用尾插法 增
     */
    public static void CreateLinkedList(){
        Scanner in = new Scanner(System.in);
        Node phead = new Node();
        phead.next = null;
        Node t = phead;
        while (true){
            System.out.println("请输入数据：");
            int data = in.nextInt();
            if(data == 0)
                break;
            Node node = new Node();
            node.data = data;
            node.next = t.next;
            t.next = node;
            t = node;
        }
        printLinkedList(phead);
        System.out.println("请输入删除的数：");
        int deleteNum = in.nextInt();
        deleteNum(phead,deleteNum);
        printLinkedList(phead);
        System.out.println();
        reverseLinkedList(phead);
        printLinkedList(phead);
    }

    public static void printLinkedList(Node phead){
        Node p = phead.next;
        while (p != null){
            System.out.print(p.data+" ");
            p = p.next;
        }
    }

    /**
     * 删
     */
    public static void deleteNum(Node phead,int data){
        Node t = phead;
        while (t.next != null){
            Node p = t.next;
            if(p.data == data){
                t.next = p.next;
                p = null;
                break;
            }else {
                t = t.next;
            }
        }
    }

    public static void reverseLinkedList(Node phead){
        Node p = phead.next;
        phead.next = null;
        while (p != null){
           Node t = p;
           p = p.next;
           t.next = phead.next;
           phead.next = t;
        }
    }
}

class Node{
    int data;
    Node next;
    public Node(){
    }
}
