package gfg_30_DaysOfCode;

import java.util.Arrays;

public class Day3_Smallest_Positive_Integer_that_can_not_be_represented_as_Sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	/////////////////////////My Solution
	class Solution { 
	    long smallestpositive(long[] array, int n){ 
	        // Your code goes here 
	        Arrays.sort(array);
	        long ans =1;
	        for(long i:array){
	            if(ans<i) return ans;
	            ans +=i;
	        }
	        return ans;
	    }
	} 
	
	//////////////////////gfg solution/////////
//	class Solution { 
//	    long smallestpositive(long[] array, int n){ 
//	        Arrays.sort(array);
//	        long result = 1; 
//	        for (int i = 0; i < n && array[i] <= result; i++) 
//	            result = result + array[i]; 
//	        return result; 
//	    }
//	} 

}
