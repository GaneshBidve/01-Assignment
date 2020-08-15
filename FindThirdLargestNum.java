/**
 * 
 */
package com.assignment;

/**
 * @author Ganesh Bidve
 *
 */
public class FindThirdLargestNum {

	/**
	 * @param args
	 */
	public static void main(String args[]) {

		int a[] = { 6, 8, 1, 9, 2, 1, 10 };
		int b[] = { 6, 8, 1, 9, 2, 1, 10, 12 };

		System.out.println("Third Largest: " + getThirdLargest(a, 6));
		System.out.println("Third Largest: " + getThirdLargest(b, 7));
	}

	public static int getThirdLargest(int[] a, int total) {
		int temp;
		for (int i = 0; i < total; i++) {
			for (int j = i + 1; j < total; j++) {
				if (a[i] > a[j]) {
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
		return a[total - 3];
	}
}