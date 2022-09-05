package String_practice;

import java.util.LinkedHashSet;
import java.util.Set;

public class removeDuplicate {

	public static void main(String[] args) {
	String ss="Navneetnseries";
	char []css=ss.toCharArray();
	Set<Character> cr=new LinkedHashSet<Character>();
	for(char cc:css) {
		cr.add(cc);
		//System.out.print(cc);

	}
	StringBuffer sb=new StringBuffer();
	for(char ccr:cr) {
		sb.append(ccr);
	}
	System.out.println(sb);
	

	}

}
