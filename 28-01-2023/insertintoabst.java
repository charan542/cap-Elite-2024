class Solution {
    public TreeNode insertIntoBST(TreeNode root, int val) {
        TreeNode s=new TreeNode(val);
        if(root==null){
            root = s;
            return root;
        }
       
        TreeNode parent=null;
         TreeNode curr=root;
        while(curr!=null){
            parent=curr;
            if(val>curr.val){
                curr=curr.right;
            }
            else{
                curr=curr.left;
            }
        }
        if(val<parent.val){
            
            parent.left=s;
           
        }
        if(val>parent.val){
            
            parent.right=s;
            
        }
        return root;
        
    }
}
