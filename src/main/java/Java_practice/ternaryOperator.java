package Java_practice;

public class ternaryOperator {

	public static void main(String[] args) {
		int num=-6;
		int count=0;
		if(num>1) {
			for(int i=1;i<=num;i++) {
				if(num%i==0) 
					count++;
			}if(count==2)
			{
			System.out.println("num is prime no");
			}
				else {
					System.out.println("num is not a prime no");
				}
			}
			
		else

	{
		System.out.println("num is not a prime no");
	}
}

}
