class Solution {
    ArrayList<Integer> l=new ArrayList<>();
    
    public void trav(TreeNode root){
        if(root==null){
            return ;
        }
        trav(root.left);
        l.add(root.val);
        trav(root.right);
                
    }

    
        public boolean isValidBST(TreeNode root) {
        trav(root);
        int m=l.get(0);
        for(int i=1;i<l.size();i++){
            if(m<l.get(i)){
                m=l.get(i);
            }
            else{
                return false;
            }
        }
        return true;
    }
}
