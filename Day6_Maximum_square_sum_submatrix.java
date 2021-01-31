package gfg_30_DaysOfCode;

public class Day6_Maximum_square_sum_submatrix {

	public int max_sum(int [][] A, int K) {
		int row = A.length;
        int col = A[0].length;
        int max = Integer.MIN_VALUE;
        
        int [][] dp = new int [row+1][col+1];
        //Intial filling of the dp array
        for(int i=1;i<dp.length;i++){
            for(int j=1;j<dp[0].length; j++){
            	//NOTE : indexing of A matrix is 1 less than the indexing in dp 
            	//due to the 0 containg initial row and column in the dp matrix
            	//and note this for loop starts from index 1 of the dp matrix
            	//so filling up of dp [1][1] = A[0][0]
                dp[i][j] = A[i-1][j-1] + dp[i-1][j] + dp[i][j-1] - dp[i-1][j-1];
                //Note the diagonel element dp[i-1][j-1] was added twice so
                // subtracted once at last.
            }
        }
        //finding the sum of each sub square matrix and comparing with max
        for(int i=1;i<dp.length;i++){
            int sum =0;
            for(int j=1;j<dp[0].length; j++){
                if(i-K>=0 && j-K>=0){
                	//note the diagonal element dp[i-K][j-K]
                	//(outside the current K * K block)
                	//was substructed twice so
                	//added one time at last
                    sum = dp[i][j] - dp[i-K][j] - dp[i][j-K] + dp[i-K][j-K];
                    max=Math.max(max,sum);    
                }
                
            }
        }
        return max;
	}
}
