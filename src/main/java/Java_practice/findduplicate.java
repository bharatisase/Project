package Java_practice;

public class findduplicate {

	public static void main(String[] args) {
		int[] a = { 2, 3, 4, 6, 7, 2, 3, 5, 7 };
		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] == a[j]) {
					System.out.println(a[i]);
				}
			}
		}

	}
}
