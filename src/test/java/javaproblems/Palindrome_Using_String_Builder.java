package javaproblems;

import java.util.Scanner;

public class Palindrome_Using_String_Builder {

	public static void main(String[] args) {
		
		System.out.println("enter any text : ");
		Scanner input = new Scanner(System.in);
		String value = input.nextLine();
		
		String s = new StringBuilder(value).reverse().toString();
		
		if(s.equalsIgnoreCase(value)) {
			System.out.println("It Is Palindrome");
		}
		else {
			System.out.println("It Is Not Palindrome");
		}
	}
}
