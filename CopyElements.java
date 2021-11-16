package dsa1week;
import java.util.ArrayList;
import java.util.List;
public class CopyElements {
	
		public static void main(String[] args) {
	    	int a[]=new int[5];
	    	
	    	List<Integer> aList = new ArrayList<>();
	    	aList.add(1);
	    	aList.add(2);
	    	aList.add(3);
	    	aList.add(4);
	    	aList.add(5);
	    	aList.add(6);
	    	
	         System.out.println(aList);
	    
	    	List<Integer> aList1 = new ArrayList<>();
	    	for(Integer val: aList) {
	    		aList1.add(val);
	    	}
	    		
				System.out.println(aList1);
	    	
		}
}
