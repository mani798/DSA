package dsa1week;

public class BinarySearch {
	
  static int binary_search(int []arr,int target) {
	  int low =0;int high= arr.length-1;
	  while(low<=high) {
		  int mid =(low+high)/2;
		  if(arr[mid]==target) return mid;
		  else if(target<arr[mid])
		  high=mid-1;
		  else low=mid+1;
		  
	  }
	  return low;
	  
  }
  public static void main(String[] args) {
	 int arr[] = {2,4,6,8,14};
	  int target =14;
	  System.out.println(binary_search(arr,target));
	  
  }
}

