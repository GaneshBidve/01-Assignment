/**
 * 
 */
package com.assignment;

import java.util.*;

/**
 * @author Ganesh Bidve
 *
 */
public class Second_Min_Max {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		int a;
		int input[] = { 1, 2, 5, 9, 6, 4, 7, 2 };

		System.out.println("Array = " + Arrays.toString(input));

		int count = input.length;

		for (int i = 0; i < count; i++) {
			for (int j = i + 1; j < count; j++) {
				if (input[i] > input[j]) {
					a = input[i];
					input[i] = input[j];
					input[j] = a;
				}
			}
		}

		System.out.println("Second Min: " + input[1]);
		System.out.println("Second Max: " + input[count - 2]);
	}
}