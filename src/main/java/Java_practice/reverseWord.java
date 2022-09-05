package Java_practice;

public class reverseWord {

	public static void main(String[] args) {
	String sr="I am learning java code in java language";
	String []ss=sr.split(" ");
	String revstring="";
	for(String ssr:ss) {
		String revword="";
		for(int i=ssr.length()-1;i>=0;i--) {
			revword=revword+ssr.charAt(i);
		}
		revstring=revstring+revword+" ";
	}
	System.out.println(revstring);

	}

}
