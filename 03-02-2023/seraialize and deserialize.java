/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Codec {

    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        String s="";
        if(root==null){
            return "null";
        }
        Queue<TreeNode> q=new LinkedList<>();
        q.add(root);
        s+=String.valueOf(root.val);
        while(!q.isEmpty()){
            int n=q.size();
            for(int i=0;i<n;i++){
                TreeNode curr=q.poll();
                if(curr.left!=null){
                    q.add(curr.left);
                    s+=","+String.valueOf(curr.left.val);

                }
                else{
                    s+=",null";
                }
                if(curr.right!=null){
                    q.add(curr.right);
                    s+=","+String.valueOf(curr.right.val);


                }
                else{
                    s+=",null";
                }
            }

        }
        return s;

        
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        if(data.equals("null")){
            return null;
        }
        String[] s=data.split(",");
       
        ArrayList<String> arr =new ArrayList<String>(Arrays.asList(s));
       
        TreeNode root=new TreeNode(Integer.parseInt(arr.get(0)));
        System.out.println(arr);
        arr.remove(0);
        Queue<TreeNode> q=new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            int n=q.size();
            for(int i=0;i<n;i++){
                TreeNode curr=q.poll();
                     

                String l=arr.get(0);
                arr.remove(0);
                String r=arr.get(0);
                arr.remove(0);
                if(l.equals("null")){
                    curr.left=null;
                }
                else{
                    TreeNode f=new TreeNode(Integer.parseInt(l));
                    curr.left=f;
                    q.add(curr.left);
                }
                if(r.equals("null")){
                    curr.right=null;
                }
                else{
                    TreeNode f=new TreeNode(Integer.parseInt(r));
                    curr.right=f;
                    q.add(curr.right);
                
                }
            }
        }
        return root;
        
    }
}

// Your Codec object will be instantiated and called as such:
// Codec ser = new Codec();
// Codec deser = new Codec();
// String tree = ser.serialize(root);
// TreeNode ans = deser.deserialize(tree);
// return ans;
