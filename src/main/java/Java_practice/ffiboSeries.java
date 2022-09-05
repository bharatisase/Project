package Java_practice;

public class ffiboSeries {

	public static void main(String[] args) {
		int num0=0;
		int num1=1;
		int sum=0;
		System.out.println(num0+""+num1);
		for(int i=0;i<=10;i++){
			sum=num0+num1;
		System.out.println(sum);
		num0=num1;
		num1=sum;
		

		}

	}

}
