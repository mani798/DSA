package dsa1week;

public class Majority {
	public static int majorityElement(int[] nums) {
        int majorityCount = nums.length/2;

        for (int num : nums) {
            int count = 0;
            for (int elem : nums) {
                if (elem == num) {
                    count += 1;
                }
            }

            if (count > majorityCount) {
                return num;
            }

        }

        return -1;    
    }
	
	
	public static void main(String[] args) {
		int nums[] = {3,2,2};
		System.out.println(majorityElement(nums));
	}
}
