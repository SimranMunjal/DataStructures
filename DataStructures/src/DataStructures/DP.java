package DataStructures;

public class DP {
	
	public static int fibM(int n, int[] dp) {
	
		if(n==0)
			return 0;
	
		if(n==1)
			return 1;
	    int ans1,ans2;
		if(dp[n-1]==0) {
			ans1=fibM(n-1,dp);
			dp[n-1]=ans1;
		}
		else {
			ans1=dp[n-1];
		}
		
		if(dp[n-2]==0) {
			ans2=fibM(n-2,dp);
			dp[n-2]=ans2;
		}
		else {
			ans2=dp[n-2];
		}
		int ans = ans1+ans2;
		return ans;
	}
	
	public static int fibI(int n) {
		
		if(n<=1)
			return n;
		
		int dp[]=new int[n+1];
		dp[0]=0;
		dp[1]=1;
		
		for(int i=2;i<=n;i++) {
			dp[i]=dp[i-1]+dp[i-2];
		}
		return dp[n];
	}
	
	public static int minStepsTo1(int n, int[] dp) {
		
		if(n==1)
			return 0;
		int op1;
		if(dp[n-1]==0) {
			op1=minStepsTo1(n-1, dp);
			dp[n-1]=op1;
		}
		else {
			op1=dp[n-1];
		}
		
		int op2=Integer.MAX_VALUE;
		if(n%2==0) {
			if(dp[n/2]==0) {
				op2=minStepsTo1(n/2, dp);
				dp[n/2]=op2;
			}
			else {
				op2=dp[n/2];
			}
		}
		int op3=Integer.MAX_VALUE;
		if(n%3==0) {
			if(dp[n/3]==0) {
				op3=minStepsTo1(n/3, dp);
				dp[n/3]=op3;
			}
			else {
				op3=dp[n/3];
			}
		}
		return Math.min(op1, Math.min(op2, op3))+1;
		
	}
	
	public static int minStepsTo1(int n) {
		
		int dp[] = new int[n+1];
		dp[1]=0;
		for(int i=2;i<=n;i++) {
			int min=dp[i-1];
			if(i%3==0) {
				if(min>dp[i/3]) {
					min=dp[i/3];
				}
			}
			if(i%2==0) {
				if(min>dp[i/2]) {
					min=dp[i/2];
				}
			}
			dp[i]=1+min;
		}
		return dp[n];
	}
	
	public static void main(String[] args) {
		
		int n=7;
		int dp[]=new int[n+1];
		System.out.println(minStepsTo1(n, dp));
		System.out.println(minStepsTo1(n));
//		System.out.println(fibI(n));
//		System.out.println(fibM(n,dp));
	}
	
}
