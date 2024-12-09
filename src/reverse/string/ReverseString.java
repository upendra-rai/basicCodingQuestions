package reverse.string;

public class ReverseString {

	public static void main(String[] args) {

		String str = "UPENDRARAI";

		ReverseStringMethod1(str);

		ReverseStringMethod2(str);

		ReverseStringMethod3(str);

		System.out.println("Using Recursion = " + ReverseStringMethod4(str));

		System.out.println("Single loop = " + ReverseStringMethod5(str));

		ReverseStringMethod6("Tail recursion for better optimization = " + ReverseStringMethod5(str));
	}

	// Here I am Using String simple for loop to Reverse String
	private static void ReverseStringMethod1(String str) {
		StringBuilder reversed = new StringBuilder();
		for (int i = str.length() - 1; i >= 0; i--) {
			reversed.append(str.charAt(i));
		}

		System.out.println("ReverseStringMethod1 = " + reversed.toString());
		// ReverseStringMethod1 = IARARDNEPU
	}

	// Here I am Using String Builder Method Reverse() to Reverse String
	private static void ReverseStringMethod2(String str) {
		StringBuilder reversed = new StringBuilder(str);
		System.out.println("ReverseStringMethod2 = " + reversed.reverse().toString());
		// ReverseStringMethod2 = IARARDNEPU

	}

	// Here I am Convert String to charArray to Reverse String
	private static void ReverseStringMethod3(String str) {
		char[] value = str.toCharArray();
		for (int i = value.length - 1; i >= 0; i--) {
			System.out.print(value[i]);
			// IARARDNEPU
		}
		System.out.println();
	}

// Here I am Using Recursion Method to Reverse String
	private static String ReverseStringMethod4(String str) {
		if (str.isEmpty()) {
			return str;
		}
		return str.charAt(str.length() - 1) + ReverseStringMethod4(str.substring(0, str.length() - 1));
	}

// Using charArray and a single loop to reverse a string
	private static String ReverseStringMethod5(String str) {
		char[] charArray = str.toCharArray();
		int left = 0, right = charArray.length - 1;
		while (left < right) {
			char temp = charArray[left];
			charArray[left] = charArray[right];
			charArray[right] = temp;
			left++;
			right--;
		}
		return new String(charArray);
	}

// Using recursion to reverse a string (tail recursion for better optimization)
	private static String ReverseStringMethod6(String str) {
		return reverseRecursively(str, str.length() - 1);
	}

	private static String reverseRecursively(String str, int index) {
		if (index < 0) {
			return "";
		}
		return str.charAt(index) + reverseRecursively(str, index - 1);

	}

}
