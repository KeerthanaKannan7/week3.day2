package week3.day2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class FindSecondLargest {

	public static void main(String[] args) {

		// storing inputs in list
		List<Integer> findingSecondLargestNum = new ArrayList<Integer>(Arrays.asList(3, 2, 11, 4, 6, 7));

		// Sorting the list using collection
		Collections.sort(findingSecondLargestNum);

		// Printing the 2nd largest number
		System.out.println("Second Largest No is : " + findingSecondLargestNum.get(findingSecondLargestNum.size() - 2));

	}
}
