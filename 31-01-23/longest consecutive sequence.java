class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> map=new HashSet<>();
        for(int i=0;i<nums.length;i++){
            map.add(nums[i]);
        }
        int max=0;
        for(int val:map){
            int length=1;
            if(!map.contains(val-1)){
                val++;
                while(map.contains(val)){
                    length++;
                    val++;
                }
                if(length>max){
                    max=length;
                }

            }
        }
        return max;
    }
}
