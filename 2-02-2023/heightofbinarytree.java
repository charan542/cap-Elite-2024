	/*
    class Node 
    	int data;
    	Node left;
    	Node right;
	*/
public static int h(Node root){
    if(root==null){
        return 0;
    }
    int l=h(root.left);
    int f=h(root.right);
    return Math.max(l,f)+1;
}
	public static int height(Node root) {
        if(root==null){
            return 0;
        }
      	// Write your code here.
        int n=h(root.left);
        int m=h(root.right);
    
        return Math.max(n,m);
    }
