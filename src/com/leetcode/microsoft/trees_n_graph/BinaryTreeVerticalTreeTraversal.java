//package com.leetcode.microsoft.trees_n_graph;
//
//import java.util.ArrayList;
//import java.util.List;
//
//public class BinaryTreeVerticalTreeTraversal {
//    public static void main(String[] args) {
//
//    }
//
//    Integer index = null;
//
//    Map<Integer, List<Integer>> map = new HashMap<>();
//    public List<List<Integer>> verticalOrder(TreeNode root) {
//
//        dfs(root);
//        List<List<Integer>> result = new ArrayList<>();
//        for(int key: new TreeSet<Integer>(map.keySet()))
//        {
//            result.add(map.get(key));
//        }
//        return result;
//
//    }
//
//    void dfs(TreeNode root)
//    {
//
//        if(root.left!=null)
//        {
//            if(index!=null)
//                index--;
//            dfs(root.left);
//
//        }
//        if(index == null)
//            index = 0;
//        List<Integer> res = new ArrayList<>();
//        if(map.containsKey(index))
//        {
//            res = map.get(index);
//        }
//        res.add(0,root.val);
//        map.put(index,res);
//
//
//
//
//        if(root.right!=null)
//        {
//            if(index!=null)
//                index++;
//            dfs(root.right);
//        }
//
//        index++;
//
//
//    }
//}
