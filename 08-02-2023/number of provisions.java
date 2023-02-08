class Solution {
    
    public int findCircleNum(int[][] isConnected) {
       ArrayList<ArrayList<Integer>> a=new ArrayList<>();
       int c=0;
       int n=isConnected.length;
       boolean[] visted=new boolean[n];
       for(int i=0;i<n;i++){
           a.add(new ArrayList<Integer>());
       }
         for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(i!=j&&isConnected[i][j]!=0){
                    a.get(i).add(j);
                    a.get(j).add(i);
                }
            }
        }
        for(int i=0;i<n;i++){
            if(!visted[i]){
                c++;
                dfs(i,a,visted);
            }
        }
        

       return c; 
    }
    public void dfs(int i,ArrayList<ArrayList<Integer>> adj,boolean[] visted){
        visted[i]=true;
        for(int j:adj.get(i)){
            if(!visted[j]){
                dfs(j,adj,visted);
            }
        }
         

    }

}
