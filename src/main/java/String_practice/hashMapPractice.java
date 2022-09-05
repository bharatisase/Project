package String_practice;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class hashMapPractice {

	public static void main(String[] args) {
		String st="Bharati";
		char []ch=st.toCharArray();
		Map <Character,Integer> chh=new HashMap<Character,Integer>();
		for(char cr:ch){
		if(chh.containsKey(cr)){
		chh.put(cr,chh.get(cr)+1);
		}else
		{
		chh.put(cr,1);
		}

		}
		System.out.println(chh);

	}

}
