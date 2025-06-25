package javaproblems;

import java.util.ArrayList;

public class FindingDuplicatesInAnArray {
	
	public static void main(String[] args) {
		
		int [] arr = {1,2,3,2,4,5,1};
		
		ArrayList items = new ArrayList<>();
		
		ArrayList duplicates = new ArrayList<>();
		
		for (int i : arr) {
			
			if(!items.contains(i)) {
				items.add(i);
			}
			else {
				duplicates.add(i);
			}
		}		
		
		System.out.println(items);
		System.out.println(duplicates);
	}
}
