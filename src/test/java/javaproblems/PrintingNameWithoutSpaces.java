package javaproblems;

import java.util.Scanner;

public class PrintingNameWithoutSpaces {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String name = " how are you ";
//		System.out.println(name);
		
		for(int i=0;i<name.length();i++) {
			if(name.charAt(i)==' ') {
				continue;
			}
			else {
				System.out.print(name.charAt(i));
			}
		}
	}

}
