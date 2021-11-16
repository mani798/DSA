package dsa1week;

public class CeilingFloor {
	
	
	public static void main(String [] args) {
	   
		int a[] = {2,3,5,6,9,11,13,15};
		int target=10;
		int low=0;
		int high=a.length-1;
		int ceiling =ceiling(a,target,low,high);
		int floor =floor(a,target,low,high);
		System.out.println(ceiling);
		System.out.println(floor);		
	}
	
	private static int ceiling(int a[],int target,int low,int high) {
		
		while(low<=high) {
			int mid = low+(high-low)/2;
			if(a[mid]==target)
				return mid+1;
			else if(a[mid]<target)
				low=mid+1;
			else
				high=mid-1;
		}
		return a[low];
	}

	private static int floor(int a[],int target,int low,int high) {
		
		while(low<=high) {
			int mid = low+(high-low)/2;
			if(a[mid]==target)
				return mid+1;
			else if(a[mid]<target)
				low=mid+1;
			else
				high=mid-1;
		}
		return a[high];
	}
	}


