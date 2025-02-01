package com.binary.search;

import java.util.HashSet;
import java.util.Set;

public class HighestAndLowestIndex {
	public static void main(String[] args) {
		int[] a = { 2, 3, 4, 5, 6, 7, 8, 9, 10, 10, 10, 10, 11, 10, 12, 23, 43, 53, 10, 17, 26 };
		uniqueSum(a);
		int target = 10;
		int lowIndex = -1;
		int highIndex = -1;

		for (int i = 0; i < a.length; i++) {
			if (a[i] == target) {
				if (lowIndex == -1) {
					lowIndex = i; // First occurrence
				}
				highIndex = i; // Keep updating till the last occurrence
			}
		}
		System.out.println("Lowest index: " + lowIndex);
		System.out.println("Highest index: " + highIndex);

	}

	private static void uniqueSum(int[] a) {
		Set<Integer> uni = new HashSet<>();
		for (int i = 0; i < a.length; i++) {
			uni.add(a[i]);
		}
		int totalSum = uni.stream().mapToInt(i -> i).sum();
		System.out.println(totalSum);
	}
}
