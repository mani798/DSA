package dsa1week;


import java.util.ArrayList;
import java.util.List;
public class Chnage3rdIndexElement {
	
	
	public static void main(String[] args) {
    	int a[]=new int[5];
    	
    	List<Integer> aList = new ArrayList<>();
    	aList.add(1);
    	aList.add(2);
    	aList.add(3);
    	aList.add(4);
    	aList.add(5);
    	aList.add(6);
    	aList.remove(3);
    	aList.add(3,8);
			for(Integer val: aList) {
    		System.out.println(val);
    	}
  }
}
