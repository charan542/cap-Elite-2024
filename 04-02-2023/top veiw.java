	/* 
    
    class Node 
    	int data;
    	Node left;
    	Node right;
	*/
	public static void topView(Node root) {
      if(root==null){
          return;
      }
        Queue<Pair> q=new ArrayDeque<>();
        TreeMap<Integer,Integer> map=new TreeMap<>();
        q.add( new Pair(0,root));
        while(!q.isEmpty()){
            int n=q.size();
            for(int i=0;i<n;i++){
                Pair curr=q.poll();
                if(!map.containsKey(curr.in)){
                    map.put(curr.in,curr.root.data);
                }
                if(curr.root.left!=null){
                    q.add(new Pair(curr.in-1,curr.root.left));
                }
                if(curr.root.right!=null){
                     q.add(new Pair(curr.in+1,curr.root.right));
                }
                
                
            }
            
        }
        Set<Integer> s=map.keySet();    
        for(int i:s){
            System.out.print(map.get(i)+" ");
            
        }
        
      
    }

static class Pair{
    int  in;
    Node root;
    Pair(int in,Node root){
        this.in=in;
        this.root=root;
    }
}
