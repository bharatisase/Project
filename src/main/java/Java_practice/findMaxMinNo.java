package Java_practice;

public class findMaxMinNo {

	public static void main(String[] args) {
	int []ar= {3,5,1,12,23,34,45,86};
	int max1=ar[0];
	int max2=ar[0];
	for(int i=1;i<ar.length;i++) {
		if(ar[i]>max1) {
			max1=ar[i];
		}else {
			max2=max1;
			}
	}
	System.out.println(max1);
	System.out.println(max2);
	
	

	}

}
