package com.company.f102;

import java.util.*;

public class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();
        boolean realStop = false;
        queue.add(root);
        TreeNode stop = new TreeNode(Integer.MAX_VALUE);
        queue.add(stop);
        List<List<Integer>> resultLists = new ArrayList<List<Integer>>();
        List<Integer> list = new ArrayList<>();
        while (!queue.isEmpty()){
            TreeNode m= queue.poll();
            if (m.val == Integer.MAX_VALUE)
            {
                if (realStop){
                    break;
                }else {
                    queue.add(stop);
                    list.add(m.val);
                    resultLists.add(list);
                    realStop = true;
                    continue;
                }
            }
            realStop = false;
            list.add(m.val);
            if (m.left!=null){
                queue.add(m.left);
            }
            if (m.right!=null){
                queue.add(m.right);
            }
        }
        return resultLists;
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(3);
        TreeNode a = new TreeNode(9);
        TreeNode b = new TreeNode(20);
        TreeNode c = new TreeNode(15);
        TreeNode d = new TreeNode(7);
        root.left = a;
        root.right = b;
        a.right = null;
        a.left = null;
        b.left = c;
        b.right = d;
        c.left = c.right = null;
        d.left = d.right = null;
        Solution solution = new Solution();
        solution.levelOrder(root);
    }
}
