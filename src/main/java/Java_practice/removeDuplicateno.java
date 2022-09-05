package Java_practice;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class removeDuplicateno {

	public static void main(String[] args) {
    int []arr= {3,4,6,4,5,3,7,8,5};
    Set<Integer> list=new HashSet<Integer>();
    for(int ar:arr) {
    	if(list.add(ar)==false) {
    		System.out.println("Duplicate element in array:"+ ""+ar);
    	}
    }
        

	}

}
