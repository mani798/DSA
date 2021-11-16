package dsa1week;

public class upperbound {
	
	static int upper_bound(int a[],int target) {
		int low=0,high=a.length-1;
		int mid=0;
		while(low<high) {
			mid =low+(high-low)/2;
			if(target>=a[mid])
				low =mid+1;
			else high =mid;
			
		}
		return high;
	}
	
	
	
  public static void main(String [] args) {
	  int a[] = {2,2,2,4,4,4,5,5,5,};
	  int target = 4;
	  System.out.println(upper_bound(a,target));
  }
}
