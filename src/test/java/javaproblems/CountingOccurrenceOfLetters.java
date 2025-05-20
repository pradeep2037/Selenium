package javaproblems;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

public class CountingOccurrenceOfLetters {

	public static void main(String[] args) {
		
		System.out.println("enter name : ");
		Scanner input = new Scanner(System.in);
		String name = input.nextLine();
		
		HashMap<Character, Integer> hs = new HashMap<Character, Integer>();
		
		for(int i=0; i<name.length();i++) {
			if(hs.containsKey(name.charAt(i))) {
				hs.put(name.charAt(i), hs.get(name.charAt(i))+1);
			}
			else {
				hs.put(name.charAt(i), 1);
			}
		}
		
		
	    Set<Entry<Character, Integer>> entries = hs.entrySet();
	    
	    for (Entry<Character, Integer> entry : entries) {
			System.out.println(entry);
		}
		
	}
}
