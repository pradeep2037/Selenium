package javaproblems;

import java.util.ArrayList;

public class PrintingWordsWhereFirstAndLastLetterMatches {

	public static void main(String[] args) {

		String words[] = { "madam", "radar", "level", "hello", "world", "refer", "test" };

		System.out.println("char : " + words[0].charAt(2));
		System.out.println("index : " + words[0].indexOf("d"));
		System.out.println("----------------------------------------------");

		ArrayList arr = new ArrayList<>();

		for (int i = 0; i < words.length; i++) {

			if(words[i].charAt(0)==words[i].charAt(words[i].length()-1)) {
				
				arr.add(words[i]);
			}
		}

		for (Object object : arr) {
			System.out.println(object);
		}
	}
}
