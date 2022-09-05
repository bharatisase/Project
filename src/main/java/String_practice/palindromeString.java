package String_practice;

public class palindromeString {

	public static void main(String[] args) {
		String str = "Bharati";
		char[] c = str.toCharArray();
		String rev = " ";
		for (int i = c.length - 1; i >= 0; i--) {
			rev = rev + c[i];
		}
		System.out.println(rev);
	}
}
