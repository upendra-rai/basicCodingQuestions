package reverse.string3;

import java.util.List;

public class StartWithLetter {
	public static void main(String[] args) {
		List<String> list = List.of("Apple", "banana", "aman", "Rakesh", "amit", "Surya");

		findWordStartWithLetter(list);
	}

	private static void findWordStartWithLetter(List<String> list) {
		list.stream().filter(v -> v.startsWith("A") || v.startsWith("a")).toList().forEach(o -> System.out.println(o));

	}

	private static void findWordStartWithLetter1(List<String> list) {
		for (String v : list) {
			if (v.startsWith("A") || v.startsWith("a")) {
				System.out.println(v);
			}
		}
	}

	private static void findWordStartWithLetter2(List<String> list) {
		for (String v : list) {
			if (v.startsWith("A") || v.startsWith("a")) {
				System.out.println(v);
			}
		}
	}

}
