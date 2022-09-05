package Java_practice;

public class countEvenOdd {

	public static void main(String[] args) {
	int num=325465764;
	int count_e=0;
	int count_o=0;
	while(num!=0) {
		int rem=num%10;
		if(rem%2==0) {
			count_e++;
		}
		else {
			count_o++;
		}
		num=num/10;
	}
	System.out.println(count_e);
	System.out.println(count_o);

	}

}
