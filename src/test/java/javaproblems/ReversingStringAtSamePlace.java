package javaproblems;

import java.util.Scanner;

import org.apache.tools.ant.taskdefs.Length;

public class ReversingStringAtSamePlace {

	public static void main(String[] args) {

		System.out.println("enter text : ");
		Scanner input = new Scanner(System.in);
		String name = input.nextLine();

		String[] words = name.split(" ");

		String revName = "";

		for (int i = 0; i < words.length; i++) {
			for (int j = words[i].length() - 1; j >= 0; j--) {

				revName = revName + words[i].charAt(j);
			}
			revName = revName + " ";

		}

		System.out.println(revName);

	}
}
