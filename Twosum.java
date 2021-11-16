package dsa1week;

public class Twosum{
static int[] sum(int [] num, int target) {
	 int p1 = 0, p2 = num.length - 1;
		while (p1 < p2) {
		    int needed = target - num[p1];
		    if (needed == num[p2])
			return new int[] { p1 + 1, p2 + 1 };
		    else if (needed < num[p2])
			p2--;
		    else
			p1++;
		}
		return null;
	    }

 public static void main(String[] args) {
	 int num [] = {2,7,11,15};
	 int target =9;
	 System.out.println(sum(num,target));
 }
}
