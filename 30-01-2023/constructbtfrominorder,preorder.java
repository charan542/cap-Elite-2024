class Solution {
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        HashMap<Integer,Integer> map =new HashMap<>();
        for(int i=0;i<inorder.length;i++){
            map.put(inorder[i],i);
        }
        int[]curr={0};
        return ct(preorder,inorder,map,0,preorder.length-1,0,inorder.length-1,curr);
    }
    public TreeNode ct(int[] pre,int[] in,HashMap<Integer,Integer> map,int ps,int pe,int is,int ie,int [] curr){
        if(pre.length==curr[0]||pe<ps||ie<is){
            return null;
        }
        TreeNode root=new TreeNode(pre[curr[0]]);
        int ip=map.get(pre[curr[0]++]);
        int cl=ip-is;
        root.left=ct(pre,in,map,ps+1,ps+cl,is,ip-1,curr);
        root.right=ct(pre,in,map,ps+cl+1,pe,ip+1,ie,curr);
        return root;
        
    } 
}
