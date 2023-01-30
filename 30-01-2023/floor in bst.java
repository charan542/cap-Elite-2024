public class Solution {

    public static int floorInBST(TreeNode<Integer> root, int X) {
        //    Write your code here.
        if(root==null){
            return 0;
        
        }
        Stack<TreeNode<Integer>> s=new Stack<>();
        TreeNode<Integer> curr=root;
        while(curr!=null||s.size()>0){
            while(curr!=null){
                s.push(curr);
                curr=curr.right;
            }
            curr=s.pop();
            if(curr.data<=X){
                return curr.data;
            }
            curr=curr.left;
        }
        return -1;
    }
}
