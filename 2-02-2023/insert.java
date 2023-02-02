 /* Node is defined as :
 class Node 
    int data;
    Node left;
    Node right;
    
    */

	public static Node insert(Node root,int data) {
        Node n=new Node(data);
        if(root==null){
            return n;
        }
        Node r=root;
        while(root!=null){
            if(root.data>data){
                if(root.left==null){
                    root.left=n;
                    return r;
                }
                root=root.left;
                
            }
                else{
                if(root.right==null){
                    root.right=n;
                    return r;
                }
                root=root.right;
                
            }
        }
        return r;
    	
    }
