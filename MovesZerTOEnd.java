package dsa1week;

public class MovesZerTOEnd {
	public static void main(String[] args) {
		int a[] = {0,1,1,0,0,0,1,0};
		int start =0;
		int end = a.length-1;
		
		while(start<=end) {
			if(a[start] == 1) {
				int temp = a[start];
				a[start] = a[end];
				a[end] = temp;
				end--;
			}
			else 
				start++;
		}
		
		for(int i : a) System.out.print(i+" ");
	}
}
