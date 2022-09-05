package Java_practice;

public class missingArray {

	public static void main(String[] args) {
		int []a={1,2,3,4,6,7,8};
		int sum=0;
		int sum1=0;
		for(int i=0;i<a.length;i++){
		sum=sum+a[i];
		}
		for(int j=1;j<=8;j++){
		sum1=sum1+j;
		}

		
		System.out.println(sum);
		System.out.println(sum1);
		System.out.println("Missing element is:"+" "+(sum1-sum));


	}

}
