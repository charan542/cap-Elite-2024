class Solution {
    public TreeNode deleteNode(TreeNode root, int key) {
        if(root==null){
            return null;
        }
        if(root.val==key){
            if(root.left==null&&root.right==null){
                return null;
            }
            if(root.left==null&&root.right!=null){
                return root.right;
            }
             if(root.left!=null&&root.right==null){
                return root.left;
            }
            
        }
        TreeNode temp=root;
        TreeNode parent=temp;
        while(temp.val!=key){
            parent=temp;
            if(temp.val>key)
            temp=temp.left;
            else
            temp=temp.right;
            if(temp==null){
                return root;
            }

        }
        if(temp.right!=null&&temp.right!=null){
            TreeNode succ=temp.right;
            TreeNode p=temp;
            while(succ.left!=null){
                p=succ;
                succ=succ.left;
            }
            if(p.val<succ.val){

                p.val=succ.val;
                if(succ.right!=null){
                    p.right=succ.right;
                }
                else{
                    p.right=null;
                }
                return root;
            }
            else{
                temp.val=succ.val;
                if(succ.right!=null){
                    p.left=succ.right;
                }
                else{
                    p.left=null;
                }
                return root;

            }

        }
        if(temp.right==null&&temp.left==null){
            if(parent.val>temp.val){
                parent.left=null;
            }
            else{
                parent.right=null;
            }
            return root;
        }
        if(temp.left!=null||temp.right!=null){
            if(parent.val>temp.val){
                if(temp.left!=null)
                parent.left=temp.left;
                else
                parent.left=temp.right;
            }
            else{
                if(temp.left!=null){
                    parent.right=temp.left;
                
                }
                else{
                    parent.right=temp.right;
                }
            }
            return root;
        }
        return root;
    }
}
