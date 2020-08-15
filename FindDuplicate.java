/**
 * 
 */
package com.assignment;

import java.util.Arrays;

/**
 * @author Ganesh Bidve
 *
 */
public class FindDuplicate {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		int[] input = { 1, 2, 5, 5, 6, 6, 7, 2 };

		System.out.println("Original Arrays : " + Arrays.toString(input));
		System.out.print("Duplicates Arrays ");

		for (int i = 0; i < input.length; i++) {

			for (int j = i + 1; j < input.length; j++) {

				if (input[i] == input[j]) {

					int dups = input[j];

					System.out.print(" : " + dups);
				}
			}
		}
	}
}