import java.util.ArrayList;

public class Solution 
{
    public static ArrayList<Integer> getLeftView(TreeNode<Integer> root) 
    {   ArrayList<Integer> l=new ArrayList<>();
        //    Write your code here.
        if(root==null){
            return l;
        }
        Queue<TreeNode> queue =new LinkedList<>();
        queue.add(root);
        while(!queue.isEmpty()){
            

            int size=queue.size();
            for(int i=0;i<size;i++){
                TreeNode<Integer> curr=queue.poll();
                if(i==0){
                    int a=curr.data;
                    l.add(a);
                }
                if(curr.left!=null){
                    queue.add(curr.left);
                }
                if(curr.right!=null){
                    queue.add(curr.right);
                }
            }
        }
        return l;
    }
}
