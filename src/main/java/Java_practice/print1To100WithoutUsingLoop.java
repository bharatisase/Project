package Java_practice;

public class print1To100WithoutUsingLoop {

	public static void main(String[] args) {
		printNumbers(1);

	}
	public static void printNumbers(int num){
		if( num<=100) {
			System.out.println(num);
			num++;
			printNumbers(num);
			
		}
	}

}
