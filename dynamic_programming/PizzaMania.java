package com.coding.challenge.dp;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class PizzaMania {

	static int ans;
	static int calls=0;
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int cases = sc.nextInt();
	    while(cases-->0){
	        int x = sc.nextInt();
	        int s = sc.nextInt();
	        int m = sc.nextInt();
	        int l = sc.nextInt();
	        int cs = sc.nextInt();
	        int cm = sc.nextInt();
	        int cl = sc.nextInt();
	        Map<Integer,Integer> cache = new HashMap<>();
	        ans = Integer.MAX_VALUE;
	        mincost(x,cache,0,s,m,l,cs,cm,cl);
	        System.out.println(ans);
	    }
	}
	private static int mincost(int capacity, Map<Integer, Integer> cache, int cost, int s, int m, int l, int cs, int cm,int cl) {
		System.out.println(calls++);
		if(capacity<=0){
			ans = Math.min(ans, cost);
			return 0;
		}
		if(cache.containsKey(capacity)) return cache.get(capacity);
		
		int val = Integer.MAX_VALUE;
		val = Math.min(val,cs+mincost(capacity-s, cache, cost+cs, s, m, l, cs, cm, cl));
		val = Math.min(val,cm+mincost(capacity-m, cache, cost+cm, s, m, l, cs, cm, cl));
		val = Math.min(val,cl+mincost(capacity-l, cache, cost+cl, s, m, l, cs, cm, cl));
		
		cache.put(capacity, val);
		
		return val;
	}

}
