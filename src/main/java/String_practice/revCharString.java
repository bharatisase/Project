package String_practice;

public class revCharString {

	public static void main(String[] args) {
	String sr="Shashank Sase";
	char []sp=sr.toCharArray();
	String rev=" ";
	for(int i=sp.length-1;i>=0;i--) {
		rev=rev+sp[i];
	}
	System.out.println(rev);

	}

}
