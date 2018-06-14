package com.coding.challenge.dp;

public class LongestPalindromeSubsequence {

	public static void main(String[] args) {
		String s1 = "GEEKSFORGEEKS";
		String s2 = new StringBuilder(s1).reverse().toString();

		lcs(s1.toCharArray(),s2.toCharArray());

	}

	private static void lcs(char[] s1, char[] s2) {
		int m = s1.length, n= s2.length;
		int[][] L = new int[m+1][n+1];

		for(int i=0;i<=m;i++){
			for(int j=0;j<=n;j++){
				if(i==0 || j==0){	
					L[i][j] = 0;
				}else if(s1[i-1] == s2[j-1]){
					L[i][j] = 1+L[i-1][j-1];
				}else{
					L[i][j] = Math.max(L[i][j-1],L[i-1][j]);
				}

			}
		}

		int index = L[m][n];
		System.out.println(index);


		String result ="";

		int i=m,j=n;
		//Start from right most bottom most column
		while(i >0 && j>0){
			// If current character in X[] and Y
			// are same, then current character
			// is part of LCS
			if(s1[i-1] == s2[j-1]){
				result +=s1[i-1];
				i--;j--;
			}
			// If not same, then find the larger of
			// two and go in the direction of larger
			// value
			else if(L[i-1][j]>L[i][j-1]){
				i--;
			}else{
				j--;
			}
		}
		System.out.println(result);
	}
}
