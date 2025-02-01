package com.binary.search;

public class Test {

	public static void main(String[] args) {
		int[] a = { 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 23, 43, 53, 17, 26 };

		int search = 11;

		int low = 0;
		int high = a.length - 1;
		int mid = (low + high) / 2;

		while (low < high) {
			if (a[mid] == search) {
				System.out.println("element index " + mid);
				break;
			} else if (a[mid] < search) {
				low = mid + 1;
			} else {
				high = mid - 1;
			}
			mid = (low + high) / 2;
		}

	}

}
