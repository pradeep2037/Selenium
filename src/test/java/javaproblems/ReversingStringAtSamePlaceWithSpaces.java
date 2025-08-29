package javaproblems;

public class ReversingStringAtSamePlaceWithSpaces {

	public static void main(String[] args) {
		
		String s = "A B C D";
		
		String name = "";
		
		for(int i=s.length()-1;i>=0;i++) {
			name = name+s.charAt(i);
		}
		
		System.out.println(name);
	}
}
