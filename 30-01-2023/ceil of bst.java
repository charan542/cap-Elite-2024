
    public  static int findCeil(TreeNode<Integer> node, int x) {
            if(node==null){
                return 0;
            }
            
            Stack<TreeNode<Integer>> s = new Stack<>();
            TreeNode<Integer> curr=node;
            while(s.size()>0||curr!=null){
                while(curr!=null){
                    s.push(curr);
                    curr=curr.left;
                }
                curr=s.pop();
                if(cTreeNode<Integer>urr.data>=x){
                    return curr.data;
                }
                curr=curr.right;

            }
            return -1;
 
        // Write your v code here

    }
}
