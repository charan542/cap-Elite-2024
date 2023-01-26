class Tree
{   int s=0;
    int countLeaves(Node node) 
    {
         if (node==null){
             return 0;
         }
         countLeaves(node.left);
         countLeaves(node.right);
         if(node.left==null&&node.right==null){
             s=s+1;
         }
         return s;
    }
}
