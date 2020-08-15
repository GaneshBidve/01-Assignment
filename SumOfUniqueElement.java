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
		int[] input = { 1, 6, 4, 3, 2, 2, 3, 8, 1 };

		sumOfDistinct_Sorting(input);

		sumOfDistinct_HashSet(input);
	}

	public static void sumOfDistinct_Sorting(int[] input) {

		// sort the given array
		Arrays.sort(input);

		int current = input[0];
		int sum = input[0];
		for (int i = 1; i < input.length; i++) {
			if (current != input[i]) {
				sum += input[i];
				current = input[i];
			}
		}
		System.out.println("Sum of all Unique elements: " + sum);
	}

	public static void sumOfDistinct_HashSet(int[] input) {

		// Create a HashSet of array elements, it will remove all the duplicates
		HashSet<Integer> hashSet = new HashSet<>();
		int sum = 0;
		for (int i = 0; i < input.length; i++) {
			if (!hashSet.contains(input[i])) {
				sum += input[i];
				hashSet.add(input[i]);
			}
		}
		System.out.println("Sum of all Unique elements " + sum);
	}

}
