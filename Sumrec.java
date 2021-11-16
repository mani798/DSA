package dsa1week;

public class Sumrec {

	public static void main(String[] args) {
		int arr[]= {1,2,5,5,10};
		int sum =calcisum(arr,arr.length);
		System.out.println(sum);
	}
private static int calcisum(int arr[],int n) {
	if(n<=0) {
		return 0;
	}
	return calcisum(arr,n-1)+arr[n-1];
}
}

