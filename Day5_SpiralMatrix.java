package gfg_30_DaysOfCode;

public class Day5_SpiralMatrix {

}
class Solution
{
   
	public int findK(int a[][], int n, int m, int k)
	{
	    // Your code goes here
	    int flag=1;
	    int top=0, left=0, right=m, bottom =n;
	    //note < not <=
	    while(top<bottom && left<right){
	        if(flag==1){
	            for(int i =left; i<right;i++){
	                k--;
	                if(k==0){
	                    return a[top][i];
	                }
	                
	            }
	            //note flags are updated outside the for loop 
	            flag=2;
	            top++;
	        }
	        if(flag==2){
	            for(int i =top; i<bottom;i++){
	                k--;
	                if(k==0){
	                    //note right-1 
	                    return a[i][right-1];
	                }
	           }
	           flag=3;
	           right--;
	        }
	        if(flag==3){
	            for(int i =right-1; i>=left;i--){
	                k--;
	                if(k==0){
	                    //note bottom-1
	                    return a[bottom-1][i];
	                }
	           }
	           flag=4;
	           bottom--;
	        }
	        if(flag==4){
	            for(int i =bottom-1; i>=top;i--){
	                k--;
	                if(k==0){
	                    return a[i][left];
	                }
	                
	            }
	            flag=1;
	            left++;
	        }
	    }
	
	    return -1;
	}
	
}