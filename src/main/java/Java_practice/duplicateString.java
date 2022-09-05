package Java_practice;

import java.util.HashMap;
import java.util.Map;

public class duplicateString {

	public static void main(String[] args) {
		String str="Bharati Shashank Sase Bharati Sase";
		String []ss=str.split("");
		Map<String,Integer> duplistring=new HashMap<String,Integer>();
		for(String word:ss){
		if(duplistring.containsKey(word)){
		duplistring.put(word,duplistring.get(word)+1);
		}
		else {
		
		duplistring.put(word,1);
		}

		}
		System.out.println(duplistring);

	}

}
