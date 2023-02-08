class Solution {
    boolean visted[][];
    char[][] g;
    int[] drow={1,-1,0,0};
    int[] dcol={0,0,-1,+1};


    public int numIslands(char[][] grid) {
        int c=0;
        int rl=grid.length;
        int cl=grid[0].length;
        visted=new boolean[rl][cl];
        for(int i=0;i<rl;i++){
            for(int j=0;j<cl;j++){
                visted[i][j]=false;
            }
        }
        g=grid;
        for(int i=0;i<rl;i++){
            for(int j=0;j<cl;j++){
                if(!visted[i][j]&&grid[i][j]!='0'){
                    c++;
                    
                    dfs(i,j);
                }
            }
        }

    return c;
    }
    public  void dfs(int i,int j){
        Stack<Pair> s=new Stack<>();
        s.add(new Pair(i,j));
        
        while(!s.empty()){
            
            Pair curr=s.pop();
            if(!isvalid(curr.geti(),curr.getj())){
                continue;
            }
            visted[curr.geti()][curr.getj()]=true;
            for(int p=0;p<4;p++){
                int k=curr.geti()+drow[p];
                int l=curr.getj()+dcol[p];
            
                
                    s.push(new Pair(k,l));
                    
                
            }
        }
    }
    public  boolean isvalid(int i,int j){
        if(i<0||j<0||i>=g.length||j>=g[0].length){
            return false;
        }

        if(visted[i][j]){
            return false;
        }
        if(g[i][j]=='0'){
            return false;
        }
        return true;
    }
    static class Pair{
        private int i;
        private int j;
        public Pair(int i,int j){
            this.i=i;
            this.j=j;
        }
        public int geti(){
            return i;
        }
        public int getj(){
            return j;
        }
    }
}
