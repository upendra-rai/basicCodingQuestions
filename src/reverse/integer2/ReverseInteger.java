package reverse.integer2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ReverseInteger {
	public static void main(String[] args) {
		List<Integer> value = List.of(1, 7, 8, 5, 2, 9, 5, 3, 4, 0);

		//reverseIntegerMethode1(value);

		System.out.println(reverseIntegerMethode2(value));

	}

	private static List<Integer> reverseIntegerMethode2(List<Integer> value) {
		if (value == null || value.size() <= 1) {
	        return new ArrayList<>(value); // Return a modifiable list
	    }
	    // Reverse the rest of the list recursively and create a new list
	    List<Integer> reversedList = new ArrayList<>(reverseIntegerMethode2(value.subList(1, value.size())));
	    reversedList.add(value.get(0)); 
	    return reversedList;
	}

	private static void reverseIntegerMethode1(List<Integer> value) {
		for (int i = value.size() - 1; i >= 0; i--) {
			System.out.print(value.get(i));
		}
	}

}
