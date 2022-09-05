package Java_practice;

import java.util.HashMap;
import java.util.Map;

public class primeNo {

	public static void main(String[] args) {
		int num=11;
		int temp=0;
		for(int i=2;i<=6;i++) {
			if(num%i==0) {
				temp=temp+1;
			}
		}
		if(temp>0) {
			System.out.println("num is not prime no ");
		}else {
			System.out.println("num is prime");
		}


	}

}
