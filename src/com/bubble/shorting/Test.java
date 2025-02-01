package com.bubble.shorting;

public class Test {
	public static void main(String[] args) {
		int[] arr = { 9, 4, 6, 3, 2, 1 };
		int temp;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j > arr.length - 1 - 1; j++) {
				if (arr[j] > arr[j + 1]) {
					temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
}
