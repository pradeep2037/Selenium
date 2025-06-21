package javaproblems;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class LeetCodeDNASequence187 {

	public static void main(String[] args) {

		String s = "AAAAACCCCCAAAAACCCCCCAAAAAGGGTTT";

		
		ArrayList arr = new ArrayList<>();
		
		HashSet seen = new HashSet<>();
		HashSet repeated = new HashSet<>();

		for(int i=0;i<=s.length()-10;i++) {
			arr.add(s.substring(i,i+10));
		}
		
		for(int i=0;i<arr.size();i++) {
			if(seen.contains(arr.get(i))) {
				repeated.add(arr.get(i));
			}
			else {
				seen.add(arr.get(i));
			}
		}
		
		for (Object object : arr) {
			System.out.println(object);
		}
		
		System.out.println(repeated);
		
	}
}
