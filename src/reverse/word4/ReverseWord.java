package reverse.word4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.regex.Pattern;

public class ReverseWord {
	public static void main(String[] args) {
		String str = "Test your English vocabulary. How many words do you know";
		// System.out.println(reverseWordMethod1(str));

		List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8);
		reversedNumber1(numbers);
	}

	private static void reversedNumber1(List<Integer> numbers) {
		for (int i = numbers.size() - 1; i >= 0; i--) {
			System.out.print(numbers.get(i));
		}

	}

	private static List<Integer> reversedNumber(List<Integer> numbers) {
		List<Integer> reversedList = new ArrayList<>(numbers);
		Collections.reverse(reversedList);
		return reversedList;
	}

	private static String reverseWordMethod1(String str) {
		Pattern pattern = Pattern.compile("\\s");

		String[] temp = pattern.split(str);

		String reverseWords = "";

		for (int i = 0; i < temp.length; i++) {
			if (i == temp.length - 1) {
				reverseWords = temp[i] + reverseWords;
			} else {
				reverseWords = " " + temp[i] + reverseWords;
			}
		}
		return reverseWords;
	}

}
