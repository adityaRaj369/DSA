package DynamicProgramming2;

public class MinCostPath {
	public static int minCostIterative(int cost[][]) {
		int m=cost.length;
		int n=cost[0].length;
		int [][] dp=new int [m+1][n+1];
		for(int i=0;i<dp.length;i++) {
			for(int j=0;j<dp[i].length;j++) {
				dp[i][j]=Integer.MAX_VALUE;
			}
		}
		for(int i=m-1;i>=0;i--) {
			for(int j=n-1;j>=0;j--) {
				if(i==m-1 && j==n-1) {
					dp[i][j]=cost[i][j];
					
				}
				int ans1=dp[i][j+1];
				int ans2=dp[i+1][j];
				int ans3=dp[i+1][j+1];
				dp[i][j]=cost[i][j]+Math.min(ans1, Math.min(ans2, ans3));
			}
		}
		return dp[0][0];
	}
	public static int minCostR(int [][] cost,int i,int j,int dp[][]) {
		int m=cost.length;
    	int n=cost[0].length;
    	if(i==m-1 && j==n-1) {
    		return cost[i][j];
    	}
    	if(i>=m || j>=n) {
    		return Integer.MAX_VALUE;
    	}
    	int ans1,ans2,ans3;
    	if(dp[i+1][j]==Integer.MIN_VALUE) {
    		ans1=minCost(cost,i+1,j);
    		dp[i+1][j]=ans1;
    	} 
    	else {
    		ans1=dp[i+1][j];
    	}
    	if(dp[i][j+1]==Integer.MIN_VALUE) {
    		ans2=minCost(cost,i,j+1);
    		dp[i][j+1]=ans2;
    	} 
    	else {
    		ans2=dp[i][j+1];
    	}
    	if(dp[i+1][j+1]==Integer.MIN_VALUE) {
    		ans3=minCost(cost,i+1,j+1);
    		dp[i+1][j+1]=ans3;
    	}
    	else {
    		ans3=dp[i+1][j+1];
    	}
    	int ans=cost[i][j]+Math.min(ans1, Math.min(ans2, ans3));
    	return ans;
	}
    public static int minCost(int [][] cost,int i,int j) { // recursive solution
    	int m=cost.length;
    	int n=cost[0].length;
    	if(i==m-1 && j==n-1) {
    		return cost[i][j];
    	}
    	if(i>=m || j>=n) {
    		return Integer.MAX_VALUE;
    	}
    	int ans1=minCost(cost,i+1,j);
    	int ans2=minCost(cost,i,j+1);
    	int ans3=minCost(cost,i+1,j+1);
    	int ans=cost[i][j]+Math.min(ans1, Math.min(ans2, ans3));
    	return ans;
    }
	public static void main(String[] args) {
//		int cost[][]= {{1,5,11},{8,13,12},{2,3,7},{15,16,18}};
//        int ans=minCost(cost,0,0);
//        System.out.println(ans);
		int cost[][]= {{1,5,11},{8,13,12},{2,3,7},{15,16,18}};
        int ans=minCost(cost,0,0);
        int dp[][]=new int[cost.length][cost[0].length];
        for(int i=0;i<dp.length;i++) {
        	for(int j=0;j<dp[0].length;i++) {
        		dp[i][j]=Integer.MIN_VALUE;
        	}
        }
        System.out.println(ans);
	}
}
