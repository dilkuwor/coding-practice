package com.leetcode.practice;

import java.util.HashMap;

public class ImplementTri {
    public static void main(String[] args) {
        Trie trie = new Trie();
        trie.insert("apple");
        System.out.println(trie.search("apple"));   // return True
        System.out.println(trie.search("app"));     // return False
        System.out.println(trie.startsWith("app")); // return True
        trie.insert("app");
        System.out.println(trie.search("app"));     // return True
    }
}

class Trie {
    private HashMap<Character,Trie> children;
    private boolean isWord;

    public Trie() {
        children = new HashMap<>();
    }

    public void insert(String word) {
        Trie current = this;
        for(int i = 0;i<word.length();i++)
        {
            if(current.children.containsKey(word.charAt(i)))
            {
                current = current.children.get(word.charAt(i));
            }
            else{
                Trie trie = new Trie();
                current.children.put(word.charAt(i),trie);
                current = trie;
            }
            if(i+1 == word.length())
            {
                current.isWord = true;
            }
        }


    }

    public boolean search(String word) {

        Trie current = this;
        for(int i = 0;i<word.length();i++)
        {
            if(current.children.containsKey(word.charAt(i)))
            {
                current = current.children.get(word.charAt(i));
                if(i + 1 == word.length())
                {
                    return current.isWord;
                }

            }
            else{
                break;
            }
        }
        return false;
    }

    public boolean startsWith(String prefix) {
        Trie current = this;
        for(int i = 0;i<prefix.length();i++)
        {
            if(current.children.containsKey(prefix.charAt(i)))
            {
                current = current.children.get(prefix.charAt(i));
                if(i + 1 == prefix.length())
                {
                    return true;
                }
            }
            else{
                break;
            }
        }
        return false;
    }
}
