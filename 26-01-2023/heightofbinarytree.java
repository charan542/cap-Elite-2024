import java.util.* ;
import java.io.*; 
/*

*********************************************************
Following is the structure for data type 'TreeNode' :
*********************************************************

class TreeNode {
    int data;
    TreeNode left;
    TreeNode right;

    TreeNode(int data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }
}
 */

public class Solution {
    static int height(TreeNode root){
        if(root==null){
            return 0;
        }
        int l=height(root.left);
        int r=height(root.right);
        return Math.max(l,r)+1;
    }

    static int maxDepth(TreeNode root) {
        // Write your code here.
    
        return height(root)-1;
        
    }
}
