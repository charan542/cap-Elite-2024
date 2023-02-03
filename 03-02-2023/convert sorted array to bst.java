/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public TreeNode sortedArrayToBST(int[] nums) {
       return ct(0,nums.length-1,nums);
        
    }
    public TreeNode ct(int s,int e,int[] arr){
        if(arr.length==0){
            return null;
        }
        if(s>e){
            return null;
        }
        int m=(s+e)/2;
        TreeNode r=new TreeNode(arr[m]);
        r.left=ct(s,m-1,arr);
        r.right=ct(m+1,e,arr);
        return r;
    }
}
