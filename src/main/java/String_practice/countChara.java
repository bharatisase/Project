package String_practice;

public class countChara {

	public static void main(String[] args) {
	String str="Bharati sase";
	//String sr[]=str.split(str);
	int count_a=0;
	int count_s=0;
	for(int i=0;i<str.length();i++) {
		if(str.charAt(i)=='a') {
			count_a++;
		}
		if(str.charAt(i)=='s') {
			count_s++;
		}
	}
	System.out.println(count_a);
	System.out.println(count_s);

	}

}
