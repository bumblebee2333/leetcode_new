package com.company.leetcode算法面试题汇总.前缀树问题;

public class Main1 {
    public static void main(String[] args) {
        Trie trie = new Trie();
        trie.insert("apple");
        System.out.println(trie.search("apple"));
        System.out.println(trie.startWith("app"));
    }
}

class Trie{
    public TrieNode root;
    public Trie(){
        root = new TrieNode();
    }

    public void insert(String s){
        TrieNode node = this.root;
        for(char ch : s.toCharArray()){
            if(node.children[ch - 'a'] == null){
                node.children[ch-'a'] = new TrieNode();
            }
            node = node.children[ch-'a'];
        }
        node.val = s;
    }

    public boolean search(String s){
        TrieNode node = this.root;
        for(char ch : s.toCharArray()){
            if(node.children[ch-'a'] != null) {
                return false;
            }
            node = node.children[ch-'a'];
        }
        return node.val.equals(s);
    }

    public boolean startWith(String s){
        TrieNode node = this.root;
        for(char ch : s.toCharArray()){
            if(node.children[ch-'a'] == null){
                return false;
            }
            node = node.children[ch-'a'];
        }
        return true;
    }

    class TrieNode{
        TrieNode[] children = new TrieNode[26];
        String val;
    }
}
