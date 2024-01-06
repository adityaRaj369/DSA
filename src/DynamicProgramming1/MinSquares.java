package DynamicProgramming1;

public class MinSquares {
	public static int minSquares1(int n) {
		int [] dp=new int [n+1];
		dp[0]=0;
		for(int i=1;i<=n;i++) {
			int minAns=Integer.MAX_VALUE;
			for(int j=1;j*j<=i;j++) {
				int currAns=dp[i-(j*j)];
				if(minAns>currAns) {
					minAns=currAns;
				}
			}
			dp[i]=1+minAns;
		}
		return dp[n];
	}
	
	public static int minSquares(int n,int dp[]) {
		if(n == 0) {
			return 0;
			}
			int minAns = Integer.MAX_VALUE;
			for(int i=1; i*i <= n;i++) {
			int currAns;
			if(dp[n-(i*i)]==-1){
			currAns = minSquares(n-(i*i),dp);
			dp[n-(i*i)] = currAns;
			} else {
			currAns = dp[n-(i*i)];
			}
			if(minAns > currAns) {
				minAns = currAns;
			}
			}
			int myAns = 1 + minAns;
			return myAns;
	}

	public static void main(String[] args) {
		int n=41;
//		int dp[]=new int[n+1];
//        for(int i=0;i<dp.length;i++) {
//        	dp[i]=-1;
//        }
//        int ans=minSquares(n,dp);
		int ans=minSquares1(n);
        System.out.println(ans);
	}
}