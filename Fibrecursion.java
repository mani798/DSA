package dsa1week;

public class Fibrecursion {

	static int fibrec(int n) {
		if(n<=1)
			return n;
		return fibrec(n-1) + fibrec(n-2);
		
	}
	
	public static void main(String[] args) {
		
		System.out.println(fibrec(8));
	}
	
}

