package find.logest.word1;

import java.util.Comparator;
import java.util.List;

public class FindLogestWord {
	public static void main(String[] args) {
		List<String> stringList = List.of("India",  "great", "a", "Lamborghini", "Upendra", "is");
		// System.out.println(findlongWord1(stringList));
		// System.out.println(findlongWord2(stringList));
		//System.out.println(findlongWord3(stringList));
		System.out.println(findlongWord4(stringList));
	}

	private static String findlongWord1(List<String> stringList) {
		String longestString = "";
		for (String value : stringList) {
			if (longestString == null || value.length() > longestString.length()) {
				longestString = value + " length =" + value.length();
			}
		}
		return longestString;
	}

	private static String findlongWord2(List<String> stringList) {
		String longestString = stringList.get(0);
		for (int i = 0; i < stringList.size(); i++) {
			if (stringList.get(i).length() > longestString.length()) {
				longestString = stringList.get(i);
			}
		}
		return longestString;
	}

	private static String findlongWord3(List<String> stringList) {
		return stringList.stream().max(Comparator.comparing(String::length))
				.orElse(null);
	}

	private static String findlongWord4(List<String> stringList) {
        // Helper method to handle recursion
        return findLongestRecursive(stringList, 0, "");
    }

    private static String findLongestRecursive(List<String> stringList, int index, String currentLongest) {
        // Base case: if index is out of bounds, return the current longest word
        if (index >= stringList.size()) {
            return currentLongest;
        }

        // Compare the current word with the current longest word
        String word = stringList.get(index);
        if (word.length() > currentLongest.length()) {
            currentLongest = word;
        }

        // Recursive call to process the next word
        return findLongestRecursive(stringList, index + 1, currentLongest);
    }

}
