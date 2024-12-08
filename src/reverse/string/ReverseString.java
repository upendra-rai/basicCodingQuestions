package reverse.string;

public class ReverseString {
	public static void main(String[] args) {
		String str = "UPENDRARAI";
		ReverseStringMethod1(str);
		ReverseStringMethod2(str);
		ReverseStringMethod3(str);
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
	}

}
