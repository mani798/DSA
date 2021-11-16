package dsa1week;

public class Sumoftwoarray {
	public static void main(String[] args) {
        int target = 9;
        int[] numbers = new int[] { 2, 7, 11, 15 };
        int[] result = twoSum(numbers, target);
        if (result != null) {
            System.out
                    .println("The sum of " + numbers[result[0]] + " and " + numbers[result[1]] + " is " + target + ".");
            System.out.println("Therefore index1 = " + (result[0] + 1) + ", index2 = " + (result[1] + 1));
        } else {
            System.out.println("No Solution found!");
        }
    }

    public static int[] twoSum(int[] numbers, int target) {
    	if (numbers == null || numbers.length == 0)
            return null;
        int i = 0;
        int j = numbers.length - 1;
        while (i < j) {
            int x = numbers[i] + numbers[j];
            if (x < target) {
                ++i;
            } else if (x > target) {
                j--;
            } else {
                return new int[] { i + 1, j + 1 };
            }
        }
        return null;
    }
	}


