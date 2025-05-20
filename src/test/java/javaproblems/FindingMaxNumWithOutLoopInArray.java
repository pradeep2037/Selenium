package javaproblems;

import java.util.Arrays;

public class FindingMaxNumWithOutLoopInArray {
	public static void main(String[] args) {
		
		int[]a = {10,70,40,100,50};	
		Arrays.sort(a);
		System.out.println(a[a.length-1]);
	}
}
