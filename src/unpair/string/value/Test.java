package unpair.string.value;

import java.util.HashMap;
import java.util.Map;

public class Test {
	public static void main(String[] args) {
		String str = "AABBCDEEFF";
		Map<Character, String> duplicatechar = unpairString(str);

	}

	private static Map<Character, String> unpairString(String str) {
		Map<Character, String> duplicatechar = new HashMap<>();
		char[] chars = str.toCharArray();
		for (int i = 0; i < chars.length; i++) {
			for (int j = i + 1; j < chars.length; j++) {
				if (chars[i] == chars[j]) {
					duplicatechar.put(chars[i], String.valueOf(chars[j]));
					System.out.println(chars[i] + " " + String.valueOf(chars[j]));
				}

			}
		}
		return duplicatechar;
	}

	private static void unpairString1(String str) {
		char[] chrs = str.toCharArray();
		for (int i = 0; i < chrs.length; i++) {
			for (int j = i + 1; j < chrs.length; j++) {
				if (chrs[i] == chrs[j]) {
					System.out.println(chrs[i] + " " + chrs[j]);
				}

			}

		}

	}

}
