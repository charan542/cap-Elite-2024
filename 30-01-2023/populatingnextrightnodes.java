class Solution {
    public Node connect(Node root) {
        if(root==null){
            return null;
        }
        Queue<Node> queue= new LinkedList<>();
        root.next=null;
        queue.add(root);
        while(!queue.isEmpty()){
            int size=queue.size();
            Queue<Node> q=new LinkedList<>();
            for(int i=0;i<size;i++){
               Node curr=queue.poll();
               if(curr.left!=null){
                   queue.add(curr.left);
                   q.add(curr.left);
               }
               if(curr.right!=null){
                   queue.add(curr.right);
                   q.add(curr.right);
               }
            }
            q.add(null);
             Node head=q.poll();
            while(q.size()>1){
               
               
            Node c=q.poll();
             
            head.next=c;
            head=head.next;

                
                
            }
        }
        return root;
    }
}
