package Java_practice;

public class intersectArray {

	public static void main(String[] args) {
	int []ar= {2,5,7,9,4,6,8};
	int []arr= {4,5,3,7,9,5,1};
	for(int i=0;i<ar.length;i++) {
		for(int j=0;j<arr.length;j++) {
			if(ar[i]==arr[j]) {
				System.out.println(ar[i]);
			}
		}
	}

	}

}
