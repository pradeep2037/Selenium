package javaproblems;

public class SumEqualsTo17 {
	
	public static void main(String[] args) {
		
		int [] a = {6,8,11,6,7,18};
		
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i]+a[j]==17) {
					System.out.println(a[i] + " & "+ a[j]);
				}
			}
		}
		
	}
}
