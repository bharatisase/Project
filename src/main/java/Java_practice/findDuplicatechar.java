package Java_practice;

import java.util.HashMap;
import java.util.Map;

public class findDuplicatechar {

	public static void main(String[] args) {
		String as = "I live in India";
		char[] cr = as.toCharArray();
		Map<Character, Integer> duplicatechar = new HashMap<Character, Integer>();
		for (char crs : cr) {
			if (duplicatechar.containsKey(crs)) {
				duplicatechar.put(crs, duplicatechar.get(crs) + 1);
			} else {
				duplicatechar.put(crs, 1);
			}
		}
		System.out.println("Duplicate char in String:" + " " + duplicatechar);
	}

}
