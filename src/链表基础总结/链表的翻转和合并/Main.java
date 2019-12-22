package 链表基础总结.链表的翻转和合并;

public class Main {
    public static void main(String[] args) {
        Test test = new Test();
        Node head1 = test.createL1();
        test.print(head1);
        System.out.println();
//        test.resverList(head1);
//        test.print(head1);
        System.out.println();
        Node head2 = test.createL2();
        test.print(head2);
        System.out.println();
        Node head3 = test.addLists(head1,head2);
        test.print(head3);
    }
}

class Test{
    public Node createL1(){
        Node head1 = new Node();
        head1.next = null;
        Node t = head1;
        for(int i=1;i<=5;i++){
            Node node = new Node();
            node.data = i;
            node.next = t.next;
            t.next = node;
            t = node;
        }
        return head1;
    }

    public Node createL2(){
        Node head2 = new Node();
        head2.next = null;
        Node t = head2;
        for(int i=2;i<=12;i += 2){
            Node node = new Node();
            node.data = i;
            node.next = t.next;
            t.next = node;
            t = node;
        }
        return head2;
    }

    public void print(Node head){
        Node t = head;
        while (t.next!=null){
            System.out.print(t.next.data);
            t = t.next;
        }
    }

    public void resverList(Node head){
        Node p = head.next;
        head.next = null;
        while (p!=null){
            Node t = p;
            p=p.next;
            t.next = head.next;
            head.next = t;
        }
    }

    //链表的合并
    public Node addLists(Node head1,Node head2){
        Node p = head1.next;
        Node pp = p;
        Node q = head2.next;
        Node qq = q;
        Node head3 = new Node();
        head3.next = null;
        Node t = head3;
        while (p!= null && q!=null){
            if(p.data <= q.data){
                p=p.next;
                pp.next = t.next;
                t.next = pp;
                t = pp;
                pp = p;
            }else {
                q=q.next;
                qq.next = t.next;
                t.next = qq;
                t = qq;
                qq = q;
            }
        }

        while (p!=null){
            p=p.next;
            pp.next = t.next;
            t.next = pp;
            t = pp;
            pp = p;
        }

        while (q!=null){
            q=q.next;
            qq.next = t.next;
            t.next = qq;
            t = qq;
            qq = q;
        }
        return head3;
    }
}

class Node{
    int data;
    Node next;
}
