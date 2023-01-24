class Solution {
    ArrayList<Integer> l= new ArrayList<Integer>();
    public List<Integer> postorderTraversal(TreeNode root) {
        if(root ==null){
            return l;
        }
        
        postorderTraversal(root.left);
        postorderTraversal(root.right);
        l.add(root.val);
        return l;
    }
}
