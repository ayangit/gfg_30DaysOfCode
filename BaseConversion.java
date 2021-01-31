package gfg_30_DaysOfCode;

public class BaseConversion {
	public static void main(String[] args) {
		long n = 10000021409L;
		long ans= toBaseNine(n);
		System.out.println(ans);
	}
//	public static long toBaseNine(long n) {
//		String s= String.valueOf(n);
//		String ans = Integer.toString( 
//	            Integer.parseInt(s, 10), 
//	            9); 
//		return Integer.parseInt(ans);
//	}
	public static long toBaseNine(long N) {
/////////////////////////////////////////////////
//Approach 1 ///////
		long  ans = 0;
		int p=1;
		long n = (long)N;
		while(n!=1) {
			ans+= p*(n%9);
			n=(int)n/9;
			p*=10;
		}
		return ans;
		
///////////////////////////////////
/////////////////////////Approach 2		
//		String s="";
//        // taking remainders by 9
//        // till N become 0
//        while(N!=0)
//        {
//            s=(char)(N%9+'0')+s;
//            N=N/9;
//        }
//        return Long.parseLong(s);
	}
}

//Input:
//10000021409
//
//Its Correct output is:
//27726721438
//
//And Your Code's output is:
//10546852254
