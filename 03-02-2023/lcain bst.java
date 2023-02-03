/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(root==null){
            return null;
        }
        if(root.val==p.val||root.val==q.val){
            return root;
        }
        TreeNode lr=lowestCommonAncestor(root.left,p,q);
        TreeNode r=lowestCommonAncestor(root.right,p,q);
        if(lr!=null&&r!=null){
            return root;
        }
        if(lr!=null){
        
        return lr;
    }
    if(r!=null){
        return r;
    }
    return null;
    }
}
