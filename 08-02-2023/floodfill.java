class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int m=image.length;
        int n=image[0].length;
        System.out.println(image.length);
        boolean[][] visted=new boolean[n][n];
        int k=image[sr][sc];

        dfs(sr,sc,image,m,n,color,k);
        return image;
        
    }
    int h=0;
    public  void dfs(int i,int j,int[][] image,int m,int n,int color,int k){
        if(i<0||j<0||i>=m||j>=n||image[i][j]!=k||image[i][j]==color){
            System.out.println(i+"   "+j+"  "+h+++"  lll"+n);
        
            return;
        }
        
        image[i][j]=color;
         System.out.println(i+"   "+j+"  "+h++);
         
        dfs(i-1,j,image,m,n,color,k);
        dfs(i+1,j,image,m,n,color,k);
        dfs(i,j-1,image,m,n,color,k);
        dfs(i,j+1,image,m,n,color,k);
    }
  
}
