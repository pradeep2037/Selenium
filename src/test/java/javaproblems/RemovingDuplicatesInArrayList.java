package javaproblems;

import java.util.ArrayList;
import java.util.HashSet;

public class RemovingDuplicatesInArrayList {

	public static void main(String[] args) {
	
		ArrayList<Integer> arrayList= new ArrayList<Integer>();
		
		arrayList.add(20);
		arrayList.add(10);
		arrayList.add(30);
		arrayList.add(20);
		arrayList.add(50);
		
		HashSet<Integer> hs = new HashSet<Integer>();
		
		for (Integer eachElement : arrayList) {
			hs.add(eachElement);
		}
		System.out.println(hs);

	}

}
