package javaproblems;

import java.util.Scanner;

public class PrintingFirstNonRepeatingNumber {

	public static void main(String[] args) {
		
		System.out.println("enter text : ");
		Scanner input = new Scanner(System.in);
		String text = input.nextLine();
		
		String s = "pradeep";
		for(int i=0; i<text.length();i++) {
			if(text.indexOf(text.charAt(i))==text.lastIndexOf(text.charAt(i))) {
				System.out.println(text.charAt(i)+" is a first non-repeating character");
				break;
			}
			
			if(i==text.length()-1) {
				System.out.println("There is a repeating characters");
			}
		}
		
	}
}
