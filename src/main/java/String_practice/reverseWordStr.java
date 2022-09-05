package String_practice;

public class reverseWordStr {

	public static void main(String[] args) {
    String str="I love India";
    String []st=str.split(" ");
    String revStr="";
    for(String stt:st) {
    	String revWord=" ";
    	for(int i=stt.length()-1;i>=0;i--) {
    		revWord=revWord+stt.charAt(i);
    	}
    	revStr=revStr+revWord;
    }
    System.out.println(revStr);
    
    

	}

}
