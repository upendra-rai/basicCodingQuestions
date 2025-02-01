package missing.number.program;

import java.util.ArrayList;
import java.util.List;

public class Test {
	public static void main(String[] args) {
		int arr[] = new int[] { 1, 2, 3, 4, 6, 7, 8, 9, 10 };
		List<String> list = List.of("xlx", "gkkg", "sdds", "dsdds");
		List<Integer> value = List.of(1, 2, 3, 4, 5, 7, 8, 9, 10);
		missingNumber(arr);
		System.out.println();
		System.out.println(findEndStartString(list));
		System.out.println();
		findEndStartStringJava8(list);
		System.out.println();
		missingNumber(value);
	}

	public static void findEndStartStringJava8(List<String> list) {
		list.stream().filter(str -> str.endsWith(String.valueOf(str.charAt(0)))).forEach(System.out::println);

	}

	public static List<String> findEndStartString(List<String> list) {
		List<String> data = new ArrayList<>();
		for (String str : list) {
			if (str.endsWith(String.valueOf(str.charAt(0)))) {
				data.add(str);
			}
		}
		return data;
	}

	public static void missingNumber(int[] arr) {
		int sum = (10 * 11) / 2;
		int actualSum = 0;
		for (int i = 0; i < arr.length; i++) {
			actualSum = actualSum + arr[i];
		}
		System.out.println("Missing number is " + (sum - actualSum));
	}

	public static void missingNumber(List<Integer> value) {
		int n = value.size() + 1; 
		int expectedSum = n * (n + 1) / 2;
		int actualSum = value.stream().mapToInt(Integer::intValue).sum();
		System.out.println("Missing number is " + (expectedSum - actualSum));
	}

}
