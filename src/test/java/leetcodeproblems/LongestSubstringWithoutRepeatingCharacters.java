package leetcodeproblems;

import java.util.ArrayList;
import java.util.Scanner;

public class LongestSubstringWithoutRepeatingCharacters {

	public static void main(String[] args) {
		

		System.out.println("enter any text : ");
		Scanner input = new Scanner(System.in);
		String value = input.nextLine();

		// Storing In An Array
		ArrayList<String> arr = new ArrayList<>();

		// Printing SubStrings
		for (int i = 0; i < value.length(); i++) {
			for (int j = i + 1; j <= value.length(); j++) {
				arr.add(value.substring(i, j));
			}
		}

//		s = {"banana", "apple", "cat"}
		
		String maxLength = "";
		
		

		for (int i = 0; i < arr.size(); i++) {
			boolean status = true;
			for (int j = 0; j < arr.get(i).length(); j++) {
				for (int k = j + 1; k < arr.get(i).length(); k++) {
					if (arr.get(i).charAt(j) == arr.get(i).charAt(k)) {
						status = false;
						break;
					}
				}
				if (status != true) {
					break;
				}
			}
			
			if(arr.get(i).length()>maxLength.length() && status == true) {
				maxLength = arr.get(i);

			}

		}
		
		System.out.println(maxLength.length());

	}
}
