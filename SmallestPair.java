/**
 * 
 */
package com.assignment;

/**
 * @author Ganesh Bidve
 *
 */
public class SmallestPair {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[] input = { 1, 7, 2, 9, 6 };
		int n = input.length;

		System.out.println(smallest_pair(input, n));
	}

	public static int smallest_pair(int[] a, int n) {

		int min = Integer.MAX_VALUE, secondMin = Integer.MAX_VALUE;
		for (int j = 0; j < n; j++) {

			if (a[j] < min) {

				secondMin = min;

				min = a[j];
			}

			else if ((a[j] < secondMin) && a[j] != min)

				secondMin = a[j];
		}

		return (secondMin + min);
	}
}
