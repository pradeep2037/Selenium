package javaproblems;

import java.util.HashSet;

public class RemovingDuplicatesInArray {
	public static void main(String[] args) {
		
		int[] a = {10,30,20,10,50};
		
		HashSet<Integer> hs = new HashSet<Integer>();
		
		for (Integer integer : a) {
			
			hs.add(integer);
		}
		
		System.out.println(hs);
		
		
		
	}
}
