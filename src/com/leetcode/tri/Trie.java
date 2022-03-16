package com.leetcode.tri;

import java.util.ArrayList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;

public class Trie {
    TriNode node;
    public Trie() {

    }

    public void insert(String word) {
        int len = 0;
        if(node == null)
        {
            node = new TriNode(word.charAt(0));

        }
        TriNode current = node;

        while (len<word.length())
        {
            boolean found = false;
            for(TriNode node: current.nodes){
                if(node.content == word.charAt(len)){
                    current = node;
                    found = true;
                    break;
                }
            }
            if(!found)
            {
                current.nodes.add(new TriNode(word.charAt(len)));
            }
            len++;
        }
    }

    public boolean search(String word) {

        int start = 0;
        TriNode current = node;
        boolean found = false;
        while (start<word.length()){

            for(TriNode node: current.nodes){
                if(node.content == word.charAt(start)){
                    current = node;
                    found = true;
                    start++;
                    break;
                }
            }

            if(!found || current.nodes.size() == 0 && start<word.length())
                return false;
            start++;
        }

        return true;
    }

    public boolean startsWith(String prefix) {
        return false;
    }
}

class TriNode{
    TriNode(char c){
        this.content = c;
    }
    List<TriNode> nodes = new ArrayList<>();
    boolean isWord;
    char content;
}
