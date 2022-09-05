package String_practice;

import java.util.HashMap;
import java.util.Map;

public class charOccurHashmap {

	public static void main(String[] args) {
		String str="Granthika Shashank Sase";
		char []ss=str.toCharArray();
		Map<Character,Integer> cr=new HashMap<Character,Integer>();
		for(char ssr:ss){
		if(cr.containsKey(ssr)){
		cr.put(ssr, cr.get(ssr)+1);
		}else
		{
		cr.put(ssr,1);
		}
		}
		System.out.print(cr);


	}

}
