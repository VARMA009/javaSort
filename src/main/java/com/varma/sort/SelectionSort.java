package com.varma.sort;

import java.util.Arrays;

/*The selection sort algorithm sorts an array by repeatedly finding the minimum element (considering ascending order) from unsorted part and putting it at the beginning. The algorithm maintains two subarrays in a given array.

1) The subarray which is already sorted.
2) Remaining subarray which is unsorted.

In every iteration of selection sort, the minimum element (considering ascending order) from the unsorted subarray is picked and moved to the sorted subarray.*/

public class SelectionSort {
	public static void main(String[] args) {
		int[] a = { 2, 4, 1, 7, 8, 3 };
		for (int i = 0; i < a.length - 1; i++) {
			System.out.println(i + "th iteration " + a[i]);
			for (int j = i + 1; j < a.length; j++) {
				System.out.println(a[i] + "-" + a[j]);
				if (a[i] > a[j]) {
					int least = a[j];
					a[j] = a[i];
					a[i] = least;
				}
			}
			System.out.println(Arrays.toString(a));
		}
	}
}