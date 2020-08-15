/**
 * 
 */
package com.assignment;

/**
 * @author Ganesh Bidve
 *
 */
public class PairsOfElementsInArray {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		int[] input = { 3, 6, 8, -8, 10, 8 };

		int sum = 16;
		findThePairs(input, sum);

	}

	public static void findThePairs(int inputArray[], int inputNumber) {

		for (int i = 0; i < inputArray.length; i++) {

			for (int j = i + 1; j < inputArray.length; j++) {

				if (inputArray[i] + inputArray[j] == inputNumber) {

					System.out.printf("\nPairs with sum 16 are (%d  %d) ", inputArray[i], inputArray[j]);
				}
			}
		}
	}
}