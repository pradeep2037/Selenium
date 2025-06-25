package javaproblems;

import java.util.Scanner;

public class Fibonanci {

	public static void main(String[] args) {
		
		System.out.println("enter number : ");
		Scanner input = new Scanner(System.in);
		int num = 10;
		
		
		int a = 0;
		int b = 1;
		
		System.out.println(a);
		
		for(int i=0;i<num;i++) {
			System.out.println(b);
			int temp = a+b;
			a=b;
			b=temp;
		}
		
//		for(int i=0; i<num;i++) {
//			System.out.println(b);
//
//			int temp = b;
//			b =a+temp;
//			a = temp;
//		}
	}
}
