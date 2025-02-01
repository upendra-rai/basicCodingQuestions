package remove.chars.string;

public class Main {

	public static void main(String[] args) {
		String str = "CloudTech";
		char c = 'C';
		removeChars(str, c);

	}

	private static void removeChars(String str, char c) {
		char[] chs = str.toCharArray();
		StringBuilder newstr = new StringBuilder();
		for (char ch : chs) {
			if (ch != c) {
				newstr.append(ch);
			}

		}
		System.out.println(newstr);
	}

}
