package com.varma.sort;

import java.util.Arrays;

public class BubbleSort {
	public static void main(String[] args) {
		//int[] a = { 2, 4, 1, 7, 8, 3 };
		int[] a = { 1, 2, 3, 4, 7, 8 };

		for (int i = 0; i < a.length - 1; i++) {
			System.out.println(i + "th iteration " + a[i]);
			for (int j = 0; j < a.length - i - 1; j++) {
				System.out.println(a[j] + "-" + a[j + 1]);
				if (a[j] > a[j + 1]) {
					int least = a[j];
					a[j] = a[j + 1];
					a[j + 1] = least;
				}
			}
			System.out.println(Arrays.toString(a));
		}
	}
}
