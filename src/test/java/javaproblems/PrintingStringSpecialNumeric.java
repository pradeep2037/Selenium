package javaproblems;

public class PrintingStringSpecialNumeric {

	public static void main(String[] args) {
		
		String s = "pradeep@123";
		
		String alpha = "";
		String special = "";
		String numeric = "";
		
		for(int i=0;i<s.length();i++) {
			if(Character.isAlphabetic(s.charAt(i))) {
				alpha = alpha + s.charAt(i);
			}
			else if (Character.isDigit(s.charAt(i))) {
				special = special + s.charAt(i);
			}
			else {
				numeric = numeric + s.charAt(i);
			}
		}
		
		System.out.println("Alpha : "+alpha);
		System.out.println("Numeric : "+special);
		System.out.println("Special : "+numeric);
	}
}
