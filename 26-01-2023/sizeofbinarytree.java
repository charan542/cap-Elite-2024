class Tree

{   static int s=0;
    static int count(Node root){
    if(root==null){
        return 0;
    }
    count(root.left);
    s+=1;
    count(root.right);
    return s;
}
	public static int getSize(Node root)
	{
        int k=count(root);
        s=0;
        return k;
    }
}

