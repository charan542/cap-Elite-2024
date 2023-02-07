class Solution {
    boolean t;
    int c=0;
    int des;
    boolean[] visted;
    List<List<Integer>> rom;
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        c=0;
        t=true;
        rom=rooms;
        des=rooms.size();
        visted= new boolean[rooms.size()];
        for(int i=0;i<des;i++){
        if(!visted[i]){
        c++;
        dfs(i);
        }
        }
    if(c==1)
        return true;
    return false;

    }
    public void dfs(int source){
        visted[source]=true;
        for(int i:rom.get(source) ){
            if(!visted[i]==true)
            dfs(i);
        }    
    }
}
