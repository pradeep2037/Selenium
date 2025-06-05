package javaproblems;

import java.util.HashSet;
import java.util.Scanner;

public class RemovingDuplicatesFromAString {

	public static void main(String[] args) {
		
		System.out.println("enter name : ");
		Scanner input = new Scanner(System.in);
		String str = input.nextLine();
		
		
		HashSet hs = new HashSet<>();
		
		String removedDuplicates = "";
		
		for(int i=0;i<str.length();i++) {
			hs.add(str.charAt(i));
		}
		
		
		for (Object object : hs) {
			
			removedDuplicates = removedDuplicates+object;
		}
		
		System.out.println(removedDuplicates);
	}
}
