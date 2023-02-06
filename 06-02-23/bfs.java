class Solution {
    // Function to return Breadth First Traversal of given graph.
    public ArrayList<Integer> bfsOfGraph(int V, ArrayList<ArrayList<Integer>> adj) {
        // Code here
        ArrayList<Integer> r=new ArrayList<>();
        boolean[] visted= new boolean[V];
        Queue<Integer> a=new LinkedList<>();
        a.add(0);
        r.add(0);
        visted[0]=true;
        while(!a.isEmpty()){
            int n=a.size();
            for(int i=0;i<n;i++){
                int curr=a.poll();
                for(int nigh:adj.get(curr))
                if(!visted[nigh]==true){
                    r.add(nigh);
                    a.add(nigh);
                    visted[nigh]=true;
                    
                }
            }
        }
        return r;
    }
}
