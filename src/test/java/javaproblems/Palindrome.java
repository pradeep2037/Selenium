package javaproblems;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {

		System.out.println("enter text : ");
		Scanner input = new Scanner(System.in);
		String name = input.nextLine();

		System.out.println(name.length());

		String rev = "";
		for (int i = name.length() - 1; i >= 0; i--) {
			rev = rev + name.charAt(i);
		}

		if (name.equalsIgnoreCase(rev)) {
			System.out.println("It is a palindrome");
		} else {
			System.out.println("It is not a palindrome");
		}
	}
}
