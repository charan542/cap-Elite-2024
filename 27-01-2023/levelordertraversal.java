class Solution {
    List<List<Integer>>  result= new ArrayList<>();
    public List<List<Integer>> levelOrder(TreeNode root) {
        if(root==null){
            return result;
        }
        
        Queue <TreeNode> queue= new LinkedList<>();
        queue.offer(root);
        List<Integer> r= new ArrayList<>();
        r.add(root.val);
        result.add(r);
        
        while(queue.size()!=0){
            
            int size=queue.size();
            List<Integer> row= new ArrayList<>();
            for(int i=0;i<size;i++){
                TreeNode curr = queue.poll();
                if(curr.left!=null){
                    row.add(curr.left.val);
                    queue.add(curr.left);
                }
                 if(curr.right!=null){
                    row.add(curr.right.val);
                    queue.add(curr.right);
                }

            }
            if(row.size()==0){
                break;
            }
            result.add(row);
        }

    return result;
    }
}
