class Solution {

    public boolean isSameTree(TreeNode p, TreeNode q) {
        if(p==null&&q==null){
            return true;
        }
        if(p==null||q==null){
            return false;
        }
        int a=q.val;
        int b=p.val;
        System.out.println("a="+a+"b="+b);
        if(a!=b){
            return false;
        }
        return isSameTree(p.left,q.left)&&isSameTree(p.right,q.right);

    }
}
