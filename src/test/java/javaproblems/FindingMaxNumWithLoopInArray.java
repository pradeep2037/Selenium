package javaproblems;

public class FindingMaxNumWithLoopInArray {

	public static void main(String[] args) {
		
		int[]a = {10,70,40,100,50};
		
		int maxNumber = 0;
		
		for(int i=0; i<a.length;i++) {
			if(a[i]>maxNumber) {
				maxNumber = a[i];
			}
		}
		System.out.println(maxNumber);
	}
}
