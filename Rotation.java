package dsa1week;

public class Rotation {
  public static void main(String[] args) {
	  int[] arr = {11,12,15,18,2,9};
	  int start =0;
	  int end = arr.length-1;
	  int count = rotation(arr,start,end);
	  System.out.println(count);
	  }

private static int rotation(int[] arr, int start, int end) {
	// TODO Auto-generated method stub
	
	if(arr[start] <arr[end]) {;
	return 0;
	}
	while(start<=end) {
		int mid =start + (end-start)/2;
		if(arr[mid] <arr[mid-1]) {
		    return mid;
		}	
		else if(arr[mid]> arr[mid+1]) {
			return mid +1;
		}
		else if(arr[start] <= arr[mid]) {
			start =mid +1; 	
		}
		else if(arr[mid] <= arr[end]) {
			end =mid -1;
		}
		}
	return 0;
	
	 
   }

  }
