package com.coding.challenge.dp;

public class MinimumJumpToReachLastBuilding {
	
	public static int R=4,C=3; 
	
	public static int dp[][] = new int[R][C];
	
	static{
		for(int i=0;i<R;i++){
			for(int j=0;j<C;j++){
				dp[i][j] = -1;
			}
		}
	}
	
	public static boolean isSafe(int x,int y){
		return (x <R && y<C);
	}
	
	public static void main(String[] args) {

		int height[][] = { { 5, 4, 2 },
                { 9, 2, 1 },
                { 2, 5, 9 },
                { 1, 3, 11 } };

		System.out.println(minJump(height,0,0));
	}

	private static int minJump(int[][] height, int x, int y) {
		//If the node is already visited
		if(dp[x][y]!=-1)
			return dp[x][y];
		
		if(x ==R-1 && y == C-1)
			return (dp[x][y]=0);
		
		int diag = Integer.MAX_VALUE;
		if(isSafe(x+1, y+1))
			diag = minJump(height, x+1, y+1) + Math.abs(height[x][y]-height[x+1][y+1]);
		
		int right = Integer.MAX_VALUE;
		if(isSafe(x, y+1))
			right = minJump(height, x, y+1) + Math.abs(height[x][y]-height[x][y+1]);
		
		int down = Integer.MAX_VALUE;
		if(isSafe(x+1, y))
			down = minJump(height, x+1, y) + Math.abs(height[x][y]-height[x+1][y]);
		
		dp[x][y] = Math.min(diag, Math.min(right, down));
		
		return dp[x][y];
	}

}
