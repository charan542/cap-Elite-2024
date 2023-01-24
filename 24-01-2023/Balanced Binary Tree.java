class Solution {
    public int height(TreeNode root){
        if(root==null){
            return 0;
        }
        int right=height(root.right);
        int left=height(root.left);
        return Math.max(right,left)+1;
    }
    public boolean isBalanced(TreeNode root) {
        if(root==null){
            return true;
        }
        int a=height(root.left);
        int b=height(root.right);
        if(Math.abs(a-b)>1){
            return false;
        }
        return isBalanced(root.left)&&isBalanced(root.right);

    }
}
