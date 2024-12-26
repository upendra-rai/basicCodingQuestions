package reverse.word4;

public class ReverseWord {
	public static void main(String[] args) {
		String str = "Test your English vocabulary. How many words do you know";
		reverseWordMethod1(str);
	}

	private static void reverseWordMethod1(String str) {
		String reverseWords = "";
		for (int i = str.length() - 1; i < 0; i--) {
			if (str.split(" ") != null) {
				str.charAt(i);
			}
		}
		System.out.println("reversed = " + str);
	}

}
