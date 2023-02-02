	/* 
    
    class Node 
    	int data;
    	Node left;
    	Node right;
	*/
	public static void levelOrder(Node root) {
      if(root==null){
          return;
      }
        Queue<Node> q=new LinkedList<>();
        q.add(root);
        System.out.print(root.data);
        while(!q.isEmpty()){
            int n=q.size();
            for(int i=0;i<n;i++){
                Node curr=q.poll();
                if(curr.left!=null){
                    System.out.print(" "+curr.left.data);
                    q.add(curr.left);
                }
                if(curr.right!=null){
                    System.out.print(" "+curr.right.data);
                    q.add(curr.right);
                }
            }
        }
      
    }
