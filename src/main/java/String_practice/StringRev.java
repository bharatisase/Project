package String_practice;

public class StringRev {

	public static void main(String[] args) {
		String str="Bharati Sase";
		char []cc=str.toCharArray();
		String rev="";
		for(int i=cc.length-1;i>=0;i--){
		rev=rev+cc[i];
		}
		System.out.print(rev);


	}

}
