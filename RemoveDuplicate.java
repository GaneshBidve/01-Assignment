/**
 * 
 */
package com.assignment;

/**
 * @author Ganesh Bidve
 *
 */
public class RemoveDuplicate {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		int input[] = { 1, 2, 5, 5, 6, 6, 7, 2 };
		int length = input.length;

		length = removeDuplicateElements(input, length);

		for (int i = 0; i < length; i++) {
			System.out.print(input[i] + " ");
		}
	}

	public static int removeDuplicateElements(int arr[], int n) {

		if (n == 0 || n == 1) {
			return n;
		}

		int[] temp = new int[n];
		int j = 0;

		for (int i = 0; i < n - 1; i++) {
			if (arr[i] != arr[i + 1]) {
				temp[j++] = arr[i];
			}
		}

		temp[j++] = arr[n - 1];

		for (int i = 0; i < j; i++) {
			arr[i] = temp[i];
		}
		return j;
	}

}