package com.company.leetcode算法面试题汇总.前缀树问题;

import java.util.*;

/**
 * 单词搜索2 可用前缀树
 */
//public class Main {
//    public static void main(String[] args) {
//        String[] words = {"oath","pea","eat","rain"};
//        char[][] board = new char[4][4];
//        List<String> list = findWords(board,words);
//        for(int i=0;i<list.size();i++){
//            System.out.println(list.get(i));
//        }
//    }
//
//    public static List<String> findWords(char[][] board, String[] words) {
//        //创建字典树
//        Trie trie = new Trie();
//        Trie.TrieNode cur = trie.root;
//        for(int i=0;i<words.length;i++){
//            trie.insert(words[i]);
//        }
//
//        //使用set防止重复
//        Set<String> result = new HashSet<>();
//        int m = board.length;
//        int n = board[0].length;
//        boolean[][] visited = new boolean[m][n];
//        for(int i=0;i<m;i++){
//            for(int j=0;j<n;j++){
//                find(board,visited,i,j,m,n,result,cur);
//            }
//        }
//        System.out.println(result);
//        return new LinkedList<String>(result);
//    }
//
//    private static void find(char[][] board, boolean[][] visited, int i, int j, int m, int n, Set<String> result, Trie.TrieNode cur){
//        if(i<0 || i>=m || j<0 || j>=n || visited[i][j]){
//            return;
//        }
//        cur = cur.children[board[i][j] - 'a'];
//        visited[i][j] = true;
//        if(cur == null){
//            visited[i][j] = false;
//            return;
//        }
//        if(cur.isLeaf){
//            result.add(cur.val);
//            return;
//        }
//
//        find(board,visited,i+1,j,m,n,result,cur);
//        find(board,visited,i,j+1,m,n,result,cur);
//        find(board,visited,i,j-1,m,n,result,cur);
//        find(board,visited,i-1,j,m,n,result,cur);
//        visited[i][j] = false;
//    }
//}
//
//class Trie{
//
//    public TrieNode root;
//
//    public Trie(){
//        this.root = new TrieNode();
//    }
//
//    public void insert(String s){
//        TrieNode node = this.root;
//        for(char c:s.toCharArray()){
//            if(node.children[c-'a'] == null){
//                node.children[c-'a'] = new TrieNode();
//            }
//            node = node.children[c-'a'];
//        }
//        node.isLeaf = true;
//        node.val = s;
//    }
//
//    class TrieNode{
//        TrieNode[] children = new TrieNode[26];
//        boolean isLeaf = false;//是否是叶子结点
//        String val;
//    }
//}
