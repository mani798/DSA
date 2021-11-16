package dsa1week;

public class SelectionSort {
	 
			public static void selectionSort(int[] a){  
		        for (int i = 0; i < a.length - 1; i++)  
		        {  
		            int index = i;  
		            for (int j = i + 1; j < a.length; j++){  
		                if (a[j] < a[index]){  
		                    index = j;
		                }  
		            }  
		            int smallerNumber = a[index];   
		            a[index] = a[i];  
		            a[i] = smallerNumber;  
		        }  
		    }  
		       
		    public static void main(String a[]){  
		        int[] arr = {9,14,3,2,43,11,58,22};    
		        selectionSort(arr); 
		         
		        for(int i:arr){  
		            System.out.print(i+" ");  
		        }  
		    }  
}
