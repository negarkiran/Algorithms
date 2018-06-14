package com.algo.strings;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String input = scanner.next();
		boolean isPalindrome = true;
		for(int i=0;i<input.length()/2;i++){
			if(input.charAt(i)!=input.charAt(input.length()-1-i)){
				isPalindrome = false;
				break;
			}
		}
		if(isPalindrome){
			System.out.println("Yes");
		}else{
			System.out.println("No");
		}
		
		scanner.close();

	}

}
