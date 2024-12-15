package com.practices;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Practice123Packages {
	public static void main(String[] args) {
		List<String> list = List.of("confused", "Freelancer", "about", " on ", "how", "to", "use", "this", "array",
				"in", "a", "that", "is", "Freelancers", "simple");

		List<Integer> intList = List.of(1, 3, 45, 67, 889, 4, 2, 4, 6, 79, 9, 9, 9);

		// ****************find Longest and Second LongestWord
		// findLogestWord(list);
		// findLogestWord1(list);
		// findLogestWord2(list);
		// findSecondLongestWord(list);

		// ********************Reverse String Value
		// reverseString(list);
		// reverseStringJava8(list);

		// ********************Reverse Integer Value
		//reverseInteger(intList);
		reverseIntegerJava8(intList);
	}

	private static void reverseIntegerJava8(List<Integer> intList) {
		List<Integer> rev = intList.stream().sorted(Comparator.reverseOrder()).toList();
		System.out.println(rev);
	}

	private static void reverseInteger(List<Integer> intList) {
		for (int i = intList.size() - 1; i >= 0; i--) {
			System.out.print(intList.get(i));
		}

	}

	private static void reverseString(List<String> list) {
		for (int i = list.size() - 1; i >= 0; i--) {
			System.out.print(list.get(i) + " ");
		}
	}

	private static void reverseStringJava8(List<String> list) {
		List<String> reversed = new ArrayList<>(list);
		Collections.reverse(reversed);
		System.out.println(reversed);
	}

	private static void findSecondLongestWord(List<String> list) {
		List<String> mutableList = new ArrayList<>(list);
		mutableList.sort(Comparator.comparing(String::length));
		System.out.println(mutableList.get(mutableList.size() - 2));
	}

	private static void findLogestWord1(List<String> list) {
		String longest = "";
		for (int i = 0; i < list.size(); i++) {
			if (longest.length() < list.get(i).length()) {
				longest = list.get(i);
			}
		}
		System.out.println("longest word = " + longest + " charSize = " + longest.length());
	}

	private static void findLogestWord2(List<String> list) {
		String value = list.stream().max(Comparator.comparing(String::length)).orElse(null);
		System.out.println(value);

	}

	private static void findLogestWord(List<String> list) {
		String longestWord = "";
		for (String str : list) {
			if (longestWord.length() < str.length()) {
				longestWord = str;
			}
		}
		System.out.println("longest Word = " + longestWord + ", charcount= " + longestWord.length());
	}

}
