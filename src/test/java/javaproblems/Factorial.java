package javaproblems;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		
		System.out.println("enter number : ");
		Scanner input = new Scanner(System.in);
		int GivenNum = input.nextInt();
		
//		int fact = 1;
//		for(int i = 1;i<=GivenNum;i++) {
//			fact = fact*i;
//		}
//		
//		System.out.println(fact);
		
		
		int fact = 1;
		int value = GivenNum;
		
		for(int i=0; i<GivenNum;i++) {
			fact = value*fact;
			value = value-1;
		}	
		
		System.out.println(fact);
	}
}
