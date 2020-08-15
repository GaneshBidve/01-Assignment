/**
 * 
 */
package com.assignment;

import java.util.Arrays;
import java.util.HashSet;

/**
 * @author Ganesh Bidve
 *
 */
public class SumOfUniqueElement {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[] arrA = { 1, 6, 4, 3, 2, 2, 3, 8, 1 };

		sumOfDistinct_Sorting(arrA);

		sumOfDistinct_HashSet(arrA);
	}

	public static void sumOfDistinct_Sorting(int[] arrA) {

		// sort the given array
		Arrays.sort(arrA);

		int current = arrA[0];
		int sum = arrA[0];
		for (int i = 1; i < arrA.length; i++) {
			if (current != arrA[i]) {
				sum += arrA[i];
				current = arrA[i];
			}
		}
		System.out.println("Sum of all Unique elements: " + sum);
	}

	public static void sumOfDistinct_HashSet(int[] arrA) {

		// Create a HashSet of array elements, it will remove all the duplicates
		HashSet<Integer> hashSet = new HashSet<>();
		int sum = 0;
		for (int i = 0; i < arrA.length; i++) {
			if (!hashSet.contains(arrA[i])) {
				sum += arrA[i];
				hashSet.add(arrA[i]);
			}
		}
		System.out.println("Sum of all Unique elements " + sum);
	}

}