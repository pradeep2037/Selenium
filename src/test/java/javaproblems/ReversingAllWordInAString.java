package javaproblems;

import java.util.Scanner;

public class ReversingAllWordInAString {

	public static void main(String[] args) {
		
		System.out.println("enter a text :- ");
		Scanner input = new Scanner(System.in);
		String value = input.nextLine();
		System.out.println("===========================================");
		String[] words = value.split(" ");
		String newStr = "";
		
		for(int i=0;i<words.length;i++) {
			for(int j=words[i].length()-1;j>=0;j--) {
				newStr = newStr + words[i].charAt(j);
			}
			newStr = newStr + " ";
		}
		
		System.out.println(newStr);
	}
}
