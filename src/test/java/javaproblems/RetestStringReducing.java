package javaproblems;

public class RetestStringReducing {

	public static void main(String[] args) {
		
		String str = "retest";
		
		int n = str.length();
		
		for(int i=0;i<str.length();i++) {
			System.out.println(str.substring(0,n));
			n = n-1;
		}
        
	}

}
 