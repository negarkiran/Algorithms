package com.coding.challenge.dp;

import java.util.Scanner;

public class KnapSack {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int testCaseCount = scanner.nextInt();
		int[][] array = new int[testCaseCount][7];
		int[][] sizeArray = new int[testCaseCount][3];
		int[][] priceArray = new int[testCaseCount][3];
		for(int i=0;i<testCaseCount;i++){
			for(int j=0;j<7;j++){
				array[i][j]=scanner.nextInt();
				if(j>0 && j<4){
					sizeArray[i][j-1]=array[i][j];
				}else if(j>3){
					priceArray[i][j-4]=array[i][j];
				}
			}
		}
		
		int weight = array[0][0];
		
		System.out.println(knapsack(weight, sizeArray[0], priceArray[0], priceArray[0].length));
	}
	
	static int max(int a, int b){
		return a>b?a:b;
	}
	
	static int knapsack(int W, int[] wt,int[] val,int n){
		int i,w;
		int K[][]= new int[n+1][W+1];
		
		for(i=0;i<=n;i++){
			for(w=0;w<=W;w++){
				if(i==0 || w==0){
					K[i][w]=0;
				}else if(wt[i-1]<=w){
					K[i][w] = max(val[i-1] + K[i-1][w-wt[i-1]],  K[i-1][w]);
				}else
	                   K[i][w] = K[i-1][w];
			}
		}
		
		return K[n][W];
	}
}
