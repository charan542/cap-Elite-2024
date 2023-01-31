class Solution {
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        HashMap<Integer,Integer> m=new HashMap<>();
        for(int i=0;i<inorder.length;i++){
            m.put(inorder[i],i);
        }
        int[] a={inorder.length-1};
        return ct(postorder,inorder,m,0,postorder.length-1,0,inorder.length-1,a);
        
    }
    public TreeNode ct(int[] post,int[] in,HashMap<Integer,Integer> map,int ps,int pe,int is,int ie,int[] curr){
        if(curr[0]==-1||pe<ps||ie<is){
            return null;
        }
        TreeNode root=new TreeNode(post[curr[0]]);
        int pl=map.get(post[curr[0]--]);
        int io=pl-is;
        root.right=ct(post,in,map,ps+pl-is,pe-1,pl+1,ie,curr);
        root.left=ct(post,in,map,ps,ps+pl-is-1,is,pl-1,curr);
        
        
        return root;

    }
}
