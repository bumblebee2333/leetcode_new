package com.company.leetcode算法面试题汇总;

/**
 * 实现Trie
 */
public class Main6 {
    public static void main(String[] args) {
        Trie trie = new Trie();
        trie.insert("apple");
        trie.startsWith("app");
        System.out.println(trie.search("app"));
    }
}

class Trie {
    //根节点
    private TrieNode root;

    /** Initialize your data structure here. */
    public Trie() {
        //初始化根节点
        root = new TrieNode();
    }

    /** Inserts a word into the trie. */
    public void insert(String word) {
        TrieNode node = this.root;
        //遍历
        for(char c: word.toCharArray()){
            if(node.children[c-'a']==null){
                node.children[c-'a']=new TrieNode();
            }
            node = node.children[c-'a'];
        }
        node.item = word;
    }

    /** Returns if the word is in the trie. */
    public boolean search(String word) {
        TrieNode node = this.root;
        //遍历
        for(char c:word.toCharArray()){
            if(node.children[c-'a']==null){
                return false;
            }
            node = node.children[c-'a'];
        }
        return node.item.equals(word);
    }

    /** Returns if there is any word in the trie that starts with the given prefix. */
    public boolean startsWith(String prefix) {
        TrieNode node = this.root;
        //遍历
        for(char c: prefix.toCharArray()){
            if(node.children[c-'a']==null){
                return false;
            }
            node = node.children[c-'a'];
        }
        return true;

    }
    //定义 前缀树节点 的结构
    class TrieNode{
        //孩子节点，分别记录26个字母
        TrieNode[] children = new TrieNode[26];
        //当前的节点（叶子节点）对应的单词
        String item = "";
    }
}
