package javaproblems;

import java.util.Scanner;

public class ReversingFirstWordInAString {

	public static void main(String[] args) {
		
		System.out.println("enter a text :- ");
		Scanner input = new Scanner(System.in);
		String value = input.nextLine();
		System.out.println("===========================================");
		
//		words = hello pradeep welcome
//		output = olleh pradeep welcome
		
//		String p = "pradeep";
		String newStr = "";
//		
//		for(int i=p.length()-1;i>=0;i--) {
//			newStr = newStr + p.charAt(i);
//		}
	

		
		String[] words = value.split(" ");
		
		for(int i=words[0].length()-1;i>=0;i--) {
			newStr = newStr + words[0].charAt(i);
		}
		newStr = newStr + " ";
		
		for(int j=1;j<words.length;j++ ) {
			newStr = newStr + words[j];
			newStr = newStr + " ";
		}	
		System.out.println(newStr);		
	}
}
