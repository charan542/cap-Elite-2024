class Solution {
    int max=0;
    public int height(TreeNode root){
        if(root==null){
            return 0;
        }
        int lr = height(root.left);
        int lh=height(root.right);
        if(lr+lh>max){
            max=lr+lh;
        }
        return Math.max(lr,lh)+1;
    }
    public int diameterOfBinaryTree(TreeNode root) {
        height(root);
        return max;
        
    }
}
