class Solution {
    public void  trav(TreeNode root){
        if(root==null){
            return;
        }
        trav(root.left);
        l.add(root.val);
        trav(root.right);


    }
    ArrayList<Integer> l=new ArrayList<Integer>();
    public int kthSmallest(TreeNode root, int k) {
            trav(root);
        return l.get(k-1);
    }
}
