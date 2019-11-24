package 树基础总结;

import java.util.*;

/**
 * Created by lixinyi 2019/11/23
 * 树的前中后遍历
 */

public class TreeTest {
    public static void main(String[] args) {
        Traversing traversing = new Traversing();
        TreeNode head = traversing.createTree(8);
        traversing.printTree(head);
        System.out.println();
        traversing.preOrding(head);
        System.out.println();
        traversing.inOrding(head);
        System.out.println();
        traversing.postOrder(head);
        System.out.println();

        //非递归
        NonRecursive non = new NonRecursive();
        non.preOrder(head);
        System.out.println();
        non.inOrder(head);
        System.out.println();
        non.postOrder(head);
    }
}

class Traversing{

    public TreeNode createTree(int total) {
        char[] arr = {'A','B','C','D','E','F','G','H'};
        int k=0;
        Scanner in = new Scanner(System.in);
        LinkedList<TreeNode> list = new LinkedList<>();
        TreeNode left = null;
        TreeNode right = null;
        TreeNode head = new TreeNode(arr[k++],left,right);
        list.add(head);
        for(int i=1;i<total-1;i++){
            TreeNode node = list.poll();
            System.out.println("是否给当前节点创建左孩子(是输1 否输0)：");
            int a = in.nextInt();
            if(a==1 && node.left == null){
                TreeNode leftNode = new TreeNode(arr[k++],null,null);
                node.left = leftNode;
                list.add(leftNode);
            }
            System.out.println("是否给当前节点创建右孩子(是输1 否输0)：");
            int b = in.nextInt();
            if(b==1 && node.right == null){
                TreeNode rightNode = new TreeNode(arr[k++],null,null);
                node.right = rightNode;
                list.add(rightNode);
            }
        }
        return head;
    }

    public void printTree(TreeNode head){
        System.out.println("当前树的所有值：");
        //层序遍历
        LinkedList<TreeNode> list = new LinkedList<>();
        list.add(head);
        for(;;){
            if(list.isEmpty())
                break;
            TreeNode node = list.poll();
            System.out.print(node.ch);
            if(node.left!=null){
                list.add(node.left);
            }
            if(node.right!=null){
                list.add(node.right);
            }
        }
    }

    //递归 先序遍历 根左右
    public void preOrding(TreeNode root){
        if (root!=null){
            visit(root);
            preOrding(root.left);
            preOrding(root.right);
        }
    }

    //中序遍历 左中右
    public void inOrding(TreeNode root){
        if(root!=null){
            inOrding(root.left);
            visit(root);
            inOrding(root.right);
        }
    }

    //后序遍历 左右中
    public void postOrder(TreeNode root){
        if(root!=null){
            postOrder(root.left);
            postOrder(root.right);
            visit(root);
        }
    }

    public void visit(TreeNode node){
        System.out.print(node.ch);
    }

    public char randomLetter(){
        String s = "ABCDEFGHIGKLMNOPQRSTUVWXYZ";
        char[] arr = s.toCharArray();
        Random random = new Random();
        return arr[random.nextInt(arr.length)];
    }
}

class NonRecursive{

    //非递归前序遍历 根左右
    public void preOrder(TreeNode root){
        Stack<TreeNode> stack = new Stack<>();
        //stack.push(root);
        //System.out.print(root.ch);
        TreeNode p = root;
        while (p!= null || isEmpty(stack)){
           while (p!=null){
               System.out.print(p.ch);
               stack.push(p);
               p=p.left;
           }
           if(stack.isEmpty()){
               break;
           }else {
               p=stack.pop();
               p=p.right;
           }
        }
    }

    public boolean isEmpty(Stack stack){
        if(stack.isEmpty()){
            return false;
        }
        return true;
    }

    //非递归中序遍历
    public void inOrder(TreeNode root){
        TreeNode p = root;
        Stack<TreeNode> stack = new Stack<>();
        while (p!=null || isEmpty(stack)){
            while (p!=null){
                stack.push(p);
                p=p.left;
            }
            if(isEmpty(stack)){
                p=stack.pop();
                System.out.print(p.ch);
                p=p.right;
            }
        }
    }

    //非递归后序遍历
    public void postOrder(TreeNode root){
        TreeNode p = root;
        TreeNode q = null;//我觉着是为了标记当栈里面只有头结点的时候为了让他走自己的右子树，否则的话没有办法判断
        Stack<TreeNode> stack = new Stack<>();
        while (p!=null || isEmpty(stack)){
            while (p!=null){
                stack.push(p);
                p=p.left;
            }
            if(isEmpty(stack)){
               p=stack.peek();
               if(p.right==null || p.right==q){
                   p=stack.pop();
                   System.out.print(p.ch);
                   q=p;
                   p=null;
               }else {
                   p=p.right;
               }
            }
        }
    }
}

class TreeNode{
    char ch;//数据
    TreeNode left = null;//左指针
    TreeNode right = null;//右指针

    public TreeNode(){

    }

    public TreeNode(char ch,TreeNode left,TreeNode right){
        this.ch = ch;
        this.left = left;
        this.right = right;
    }

    public void setValue(char value){
        this.ch = value;
    }

    public char getValue(){
        return ch;
    }
}