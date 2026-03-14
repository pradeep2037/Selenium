package javaproblems;

public class ReversingCharacterAtSamePlaceWithSpaces {

	public static void main(String[] args) {
		
		String s = "A B C D";
		
		String newStr = "";
		
		for(int i=s.length()-1;i>=0;i--) {
			newStr = newStr+s.charAt(i);
		}
		
		System.out.println(newStr);
	}
}
