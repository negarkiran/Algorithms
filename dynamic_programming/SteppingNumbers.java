package com.coding.challenge.dp;

public class SteppingNumbers {

	public static void main(String[] args) {
		int n = 2;
        System.out.println(steppingNumbers(n));
	}

	private static int steppingNumbers(int n) {
		int[][] dp = new int[n+1][10];
		
		if(n==1)
			return 10;
		
		for(int j=0;j<=9;j++)
			dp[1][j] = 1;
		
		for(int i=2;i<=n;i++)
		{	for(int j=0;j<=9;j++)
			{	
				if(j==0)
					dp[i][j] = dp[i-1][j+1];
				else if(j==9)
					dp[i][j] = dp[i-1][j-1];
				else
					dp[i][j] = dp[i-1][j-1] + dp[i-1][j+1];
			}
		}
		// stores the final answer
        int sum = 0;
        for (int j = 1; j <= 9; j++)
            sum += dp[n][j];
        return sum;
	}

}
