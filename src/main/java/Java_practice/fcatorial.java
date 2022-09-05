package Java_practice;

import java.util.LinkedHashSet;
import java.util.Set;

public class fcatorial {

	public static void main(String[] args) {
	String str= "Bharati Shirsath";
	int vcount=0;
	int ccount=0;
	int count =0;
	
	for(int i=0;i<str.length();i++) {
		if(str.charAt(i)=='a'|| str.charAt(i)=='e'|| str.charAt(i)=='i'
				||str.charAt(i)=='o' || str.charAt(i)=='u') {
			vcount++;
		}
		if (str.charAt(i)==' ') {
			count++;
			
		}
		else {
			ccount++;
		}
	}
	System.out.println(vcount);
	System.out.println(ccount);
	}

}
