package String_practice;

import java.util.HashMap;
import java.util.Map;

public class reverseWordString {

	public static void main(String[] args) {
		String sp = "Bharati";
		char[] cc = sp.toCharArray();
		Map<Character, Integer> charDupli = new HashMap<Character, Integer>();
		for (char ccr : cc) {
			if (charDupli.containsKey(ccr)) {
				charDupli.put(ccr, charDupli.get(ccr) + 1);
			} else {
				charDupli.put(ccr, 1);
			}
		}
		System.out.println(charDupli);
	}
}
