package com.algo.strings;

import java.util.Scanner;

public class String1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        System.out.println(A.length()+B.length());
        
        int count=0;
        for(int i =0;i<A.length();i++){
        	if(A.charAt(i)<B.charAt(i)){
        		System.out.println("No");
        		break;
        	}else if(A.charAt(i)>B.charAt(i)){
        		System.out.println("Yes");
        		break;
        	}else{
        		count++;
        		continue;
        	}
        }
        if(count==A.length() || count==B.length()){
        	System.out.println("No");
        }
        
        System.out.println(A.substring(0,1).toUpperCase()+A.substring(1) 
		   +" "+
		   B.substring(0,1).toUpperCase()+B.substring(1));
        
       sc.close();

	}

}
