package dsa1week;

public class Frequency {
static int frequency1(int a[],int target) {
	int low = 0, high=a.length-1;
	while(low<=high) {
		int mid =low+(high-low)/2;
		if(target<=a[mid])
			high=mid-1;
		else low=mid+1;
		
	}
	return low;
}
	static int frequency2(int a[],int target) {
		int low = 0, high=a.length-1;
		while(low<high) {
			int mid =low+(high-low)/2;
			if(target<=a[mid])
				low=mid+1;
			else high=mid;
			
		}
		return high;
}	
  public static void main(String[] args) {
	  int [] a = {1,1,2,2,4,5,5,6,6,6,6,9,10,11};
	  int target =6;
	  System.out.println(frequency2(a,target)-frequency1(a,target));
	  
  }
}
