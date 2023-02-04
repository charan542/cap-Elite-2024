class Solution {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> l= new ArrayList<>();
        if(root==null){
            return l;
        }
        boolean zig=true;
        Queue<TreeNode> queue =new LinkedList<>();
        queue.add(root);
        
        while(!queue.isEmpty()){
            List<Integer> l1=new ArrayList<Integer>();
            int n=queue.size();
            for(int i=0;i<n;i++){
                TreeNode curr=queue.poll();
                l1.add(curr.val);
                if(curr.left!=null){
                   
                    queue.add(curr.left);
                }
                 if(curr.right!=null){
                  
                    queue.add(curr.right);
                }
            }
            if(zig==false){
                List<Integer> l2=new ArrayList<Integer>();
                for(int i=l1.size()-1;i>=0;i--){
                    l2.add(l1.get(i));
                }
                l.add(l2);
                zig=true;
            }
            else{
                l.add(l1);
                zig=false;
            }
        }

    return l;
        
    }
}
