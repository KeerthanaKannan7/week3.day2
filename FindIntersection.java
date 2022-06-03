package week3.day2;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class FindIntersection {

	public static void main(String[] args) {
		
		//creation of lists
		List<Integer> array1 = new LinkedList<Integer>(Arrays.asList(3, 2, 11, 4, 6, 7));
		List<Integer> array2 = new LinkedList<Integer>(Arrays.asList(1, 2, 8, 4, 9, 7));
		
		//Looping using the length of 1st array
		for (int i = 0; i < array1.size(); i++) {
			//Looping using the length of 2nd array
			for (int j = 0; j < array2.size(); j++) {
				//comparing the 2 variables and printing variable of array1
				if (array1.get(i) == array2.get(j)) {
					System.out.println("Intersection: " + array1.get(i));
				}
			}
		}

	}

}
