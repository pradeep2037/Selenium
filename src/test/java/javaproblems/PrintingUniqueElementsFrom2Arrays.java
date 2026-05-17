package javaproblems;

import java.util.ArrayList;

public class PrintingUniqueElementsFrom2Arrays {

	public static void main(String[] args) {
		
		int[] array1 = {2,4,5,7,1,38};
		int[] array2 = {4,2,1,45,23,34};
		
		
		
		ArrayList firstIteration = new ArrayList<>();
		ArrayList secondIteration = new ArrayList<>();
		
		for(int i=0;i<array1.length;i++) {
			if(!firstIteration.contains(array1[i])){
				firstIteration.add(array1[i]);
			}
		}
		
		for(int j=0;j<array2.length;j++) {
			if(firstIteration.contains(array2[j])) {
				secondIteration.add(array2[j]);
			}
		}
		
		System.out.println(secondIteration);
	}
}
