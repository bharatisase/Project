package Java_practice;

public class countNo {

	public static void main(String[] args) {
	int num=23456789;
	int count=0;
	while(num!=0) {
		int rem=num%10;
		count++;
		num=num/10;
	}
	System.out.println(count);

	}

}
