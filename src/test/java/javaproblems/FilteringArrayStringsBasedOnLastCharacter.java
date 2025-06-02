package javaproblems;

import java.util.ArrayList;

public class FilteringArrayStringsBasedOnLastCharacter {

	public static void main(String[] args) {
		
		String [] arr = {"apple","grape","orange","banana","papaya","guava","date"};
		
		ArrayList<String> e = new ArrayList<String>();
		ArrayList<String> a = new ArrayList<String>();
		ArrayList<String> t = new ArrayList<String>();

		
		for(int i=0;i<arr.length;i++) {
			
			int var = arr[i].length()-1;
			if(arr[i].charAt(var)=='e' && arr[i]!="date") {
				e.add(arr[i]);
			}
			else if(arr[i].charAt(var)=='a' && arr[i]!="date") {
				a.add(arr[i]);
			}
			else {
				t.add(arr[i]);
			}
		}
		
		System.out.println("e = "+e);
		System.out.println("a = "+a);
		System.out.println("t = "+t);

	}
}
