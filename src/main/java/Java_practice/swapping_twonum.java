package Java_practice;

public class swapping_twonum {
	public void swapnum() {
	int num1=25;
	int num2=35;
   num1=num1+num2;    //25+35=60
    num2=num1-num2;    //60-35=25
    num1=num1-num2;
    System.out.println(num1);
    System.out.println(num2);
	}

	public static void main(String[] args) {
		swapping_twonum obj=new swapping_twonum();
obj.swapnum();
	}

}
