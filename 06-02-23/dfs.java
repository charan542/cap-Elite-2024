class Solution {
    // Function to return a list containing the DFS traversal of the graph.
    ArrayList<Integer> r= new ArrayList<>();
    boolean[] visted;
    ArrayList<ArrayList<Integer>> a;
    public ArrayList<Integer> dfsOfGraph(int V, ArrayList<ArrayList<Integer>> adj) {
        visted=new boolean[V];
        a=adj;
        // Code here
        dfs(0);
        return r;
        
    }
    public void dfs(int source){
        visted[source]=true;
        r.add(source);
        for(int neigh: a.get(source)){
            if(!visted[neigh]==true){
                dfs(neigh);
            }
        }
    }
}
