package String_practice;

import java.util.HashMap;
import java.util.Map;

public class findDupliactechar {

	public static void main(String[] args) {
		String str= "elephanteeaaa";
char []ch=str.toCharArray();
Map<Character,Integer> chlist=new HashMap<Character,Integer>();
for(char chh:ch) {
	if(chlist.containsKey(chh)) {
		chlist.put(chh, chlist.get(chh)+1);
	}else {
		chlist.put(chh, 1);
	}
	
}
System.out.println(chlist);

	}

}
