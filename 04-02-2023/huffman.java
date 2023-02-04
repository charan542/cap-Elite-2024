/*  
	class Node
		public  int frequency; // the frequency of this tree
    	public  char data;
    	public  Node left, right;
    
*/ 

    void decode(String s, Node root) {
        Node l =root;
        
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch=='0'){
                l=l.left;
                if(l.left==null){
                    System.out.print(l.data);
                    l=root;
                }
            }
            if(ch=='1'){
                l=l.right;
                if(l.right==null){
                    System.out.print(l.data);
                    l=root;
                }
            }
        }
    


    }
