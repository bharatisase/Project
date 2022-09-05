package Java_practice;

import java.util.HashMap;
import java.util.Map;

public class duplicateWord {

	public static void main(String[] args) {
		String str = "Bharati Shashank Sase";
		String []st=str.split(" ");
		String revString=" ";
		for(String stt:st) {
			String revWord=" ";
			for(int i=stt.length()-1;i>=0;i--) {
				revWord=revWord+stt.charAt(i);
			}
			revString=revString+revWord;
		}
		System.out.println(revString);

		}
	}


