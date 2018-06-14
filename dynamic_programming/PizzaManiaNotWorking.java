package com.coding.challenge.dp;

import java.util.Scanner;

public class PizzaManiaNotWorking {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int testCaseCount = scanner.nextInt();
		int[][] array = new int[testCaseCount][7];
		for(int i=0;i<testCaseCount;i++){
			for(int j=0;j<7;j++){
				array[i][j]=scanner.nextInt();
			}
			
			int sCount = getPizzaSize(array, i,1);
			int mCount = getPizzaSize(array, i,2);
			int lCount = getPizzaSize(array, i,3);
			
			int sPrice = sCount * array[i][4]; 
			int mPrice = mCount * array[i][5];
			int lPrice = lCount * array[i][6];
			
			System.out.println(findMin(sPrice,mPrice,lPrice));
			
		}
	}

	private static int getPizzaSize(int[][] array, int i,int pos) {
		int sMod = array[i][0]%array[i][pos];
		int sCount =0;
		if(sMod!=0){
			sCount = array[i][0]/array[i][pos] +1;
		}else{
			sCount = array[i][0]/array[i][pos];
		}
		return sCount;
	}

	private static int findMin(int  sPrice, int  mPrice, int lPrice) {
		
		int  min=sPrice;
		if(sPrice<min){
			min = sPrice;
		}
		if(mPrice<min){
			min = mPrice;
		}
		if(lPrice<min){
			min = lPrice;
		}
		
		return min;
	}

}
