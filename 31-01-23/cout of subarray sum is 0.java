import java.util.* ;
import java.io.*; 

public class Solution {

	public static int countSubarrays(int n, int[] arr) {
		// Write your code here.
		HashMap<Integer,Integer> map=new HashMap<>();
		map.put(0,1);
		int c=0;
		int sum=0;
		for(int i=0;i<n;i++){
			sum=sum+arr[i];
		
			if(map.containsKey(sum)  ){
	
				c+=map.get(sum);
				
				map.put(sum,map.get(sum)+1);
				
			}
			else {
				map.put(sum,1);
				
			}
			

		}

		return c;
	}

}
