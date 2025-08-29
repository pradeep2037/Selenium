package javaproblems;

import java.util.Scanner;

public class PrintingPossibleSubStrings {

	public static void main(String[] args) {
		
		System.out.println("enter any text : ");
		Scanner input = new Scanner(System.in);
		String value = input.nextLine();
				
		for(int i=0;i<=value.length();i++) {
			for(int j=i+1;j<=value.length();j++) {
				System.out.println(value.substring(i,j));
			}
		}
	}
}
