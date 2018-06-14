package com.algo.strings;

import java.util.Scanner;

public class LexSubString {

	public static String getSmallestAndLargest(String s, int k) {
        String smallest = "";
        String largest = "";
        String[] substrings = new String[s.length()-k+1];
        for(int i = 0;i<=s.length()-k;i++){
        	substrings[i] = s.substring(i,i+k);
        }
        
        smallest = substrings[0];
        largest = substrings[0];
        for(int j=1;j<substrings.length;j++){
        	if(substrings[j].compareTo(smallest) <0){
        		smallest = substrings[j];
        	}
        	
        	if(substrings[j].compareTo(largest) >0){
        		largest = substrings[j];
        	}
        	
        }
        return smallest + "\n" + largest;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();
      
        System.out.println(getSmallestAndLargest(s, k));
    }

}
