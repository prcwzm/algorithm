package com.company.f236;

import java.nio.file.ClosedWatchServiceException;

public class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        TreeNode finder = new TreeNode(-1);
        findParents(root,p,q,finder);
        return finder;
    }
    public int findParents(TreeNode root,TreeNode p,TreeNode q,TreeNode finder)
    {
        if (root==null)
        {
            return 0;
        }
        int value = findParents(root.left,p,q,finder)+findParents(root.right,p,q,finder);
        if (value==2)
        {
            finder.val = root.val;
            finder.left = root.left;
            finder.right = root.right;
            value =0;
        }
        if (root.val==p.val||root.val==q.val)
        {
            value++;
        }
        return value;
    }

    public static void main(String[] args) {
        TreeNode a = new TreeNode(1);
        TreeNode b = new TreeNode(2);
        TreeNode c = new TreeNode(3);
        TreeNode d = new TreeNode(4);
        TreeNode e = new TreeNode(5);
        a.left = b;
        a.right = c;
        b.left = d;
        d.left = d.right = null;
        b.right = null;
        c.left = null;
        c.right = e;
        e.left = e.right = null;
        Solution solution = new Solution();
        TreeNode finder = solution.lowestCommonAncestor(a,c,e);
        System.out.println(finder.val);
    }
}
