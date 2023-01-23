class Solution {
    public int lengthOfLongestSubstring(String s) {
        int i=0,j=0,c=0;
        String l="";
        
        if(s.length()==1){
            return 1;
        }
        while(i<s.length() && j<s.length()){

            String k=s.substring(j,j+1);
             
            if((l.contains(k))){
                
                if(l.length()>c){
                    c=l.length();
                }
                
                l="";
                i=i+1;
                j=i;

                
            }
            else{
                l+=k;
                j+=1;
                 

            }
        }
        if(l.length()>c){
                    return l.length();
                }
            else{
                return c;
            }
    }
}