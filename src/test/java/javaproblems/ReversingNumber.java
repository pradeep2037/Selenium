package javaproblems;

import java.util.Scanner;

public class ReversingNumber {

	public static void main(String[] args) {
		System.out.println("enter number : ");
		Scanner input = new Scanner(System.in);
		String name = input.nextLine();

		String rev = "";

		System.out.println(name.length() - 1);

		for (int i = name.length() - 1; i >= 0; i--) {
			System.out.print(name.charAt(i));
			rev = rev + name.charAt(i);
		}
		
		System.out.println();
		System.out.println(rev);
		
//		int num = Integer.parseInt(rev);
//		System.out.println();
//		System.out.println(num);

	}
}
