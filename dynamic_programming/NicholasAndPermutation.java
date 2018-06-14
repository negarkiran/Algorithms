package com.coding.challenge.dp;

import java.util.Scanner;

public class NicholasAndPermutation {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int[] array = new int[n];
		for(int i=0;i<n;i++){
			array[i]=scanner.nextInt();
		}
		findMaxDistance(n,array);
	}

	private static void findMaxDistance(int n, int[] array) {
		int min=0,max=0;
		int minPos=0,maxPos=0;
		
		if(n==0){
			return;
		}else{
			min = array[0];
			max = array[0];
		}
		
		for(int i=0;i<n;i++){
			if(array[i]<min){
				min = array[i];
				minPos = i;
			}
			if(array[i]>max){
				max=array[i];
				maxPos=i;
			}
		}
		
		singleSwap(minPos,maxPos,array);
	}

	private static void singleSwap(int minPos, int maxPos, int[] array) {
		int minSmallSwap = Math.abs(maxPos-0);
		int minLargeSwap = Math.abs(maxPos-(array.length-1));
		
		int maxSmallSwap = Math.abs(minPos-0);
		int maxLargeSwap = Math.abs(minPos-(array.length-1));
		
		int max=0;
		if(minSmallSwap>max){
			max=minSmallSwap;
		}
		if(minLargeSwap>max){
			max=minLargeSwap;
		}
		if(maxSmallSwap>max){
			max=maxSmallSwap;
		}
		if(maxLargeSwap>max){
			max=maxLargeSwap;
		}
		
		System.out.println(max);
	}

}
