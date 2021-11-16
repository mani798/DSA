package dsa1week;

public class InsertionSot {
	static void insertionsort(int a[]) {
    	int n=a.length;
    	
    	for(int i=1;i<n;++i) {
    		int key=a[i];
    		int j=i-1;
    		 while(j>=0 && a[j]>key) {
    			 a[j+1]=a[j];
    			 j=j-1;
    				
    			}
    		 a[j+1]=key;
    		}
    		
    	}
    
    	
    	static void printArray(int a[]) {
    		int n=a.length;
    		for(int i=0;i<n;++i) {
    			System.out.print(a[i] + " ");
    			System.out.println();
    		
    	}
    }
    	public static void main(String[] args) {
      	  int a[]= {4,5,3,7,8,10};
      	  int n=a.length;
      	 insertionsort(a);
      	  for(int i=0;i<n;i++) {
      		  System.out.print(a[i] + " ");
      	  }
    	}	  

}
