package Java_practice;

public class rev_String {

	public static void main(String[] args) {
	String s="Nachiket";
	String rev=" ";
	char []c=s.toCharArray();
	for(int i=c.length-1;i>=0;i--) {
		rev=rev+c[i];
	}
	System.out.println(rev);

	}

}
