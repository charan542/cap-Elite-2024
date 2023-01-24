class Solution {
    public int minDepth(TreeNode root) {
        if(root==null){
            return 0;
        }
        int right=minDepth(root.right);
        int left=minDepth(root.left);
        if(left==0||right==0){
            return left+right+1;
        }
        else{
            return Math.min(left,right)+1;
        }
    }
}
