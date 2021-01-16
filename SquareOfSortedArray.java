import java.util.Arrays;

/**
 * Given an integer array nums sorted in non-decreasing order, return an array of the squares of each number sorted in non-decreasing order.
 *
 *
 *
 * Example 1:
 *
 * Input: nums = [-4,-1,0,3,10]
 * Output: [0,1,9,16,100]
 * Explanation: After squaring, the array becomes [16,1,0,9,100].
 * After sorting, it becomes [0,1,9,16,100].
 * Example 2:
 *
 * Input: nums = [-7,-3,2,3,11]
 * Output: [4,9,9,49,121]
 */
public class SquareOfSortedArray {
    public static void main(String[] args) {
        int[] nums = {-7, -3, 2, 11, 3};
        int[] output = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            int sq = nums[i] * nums[i];
            if (output[i] == 0) {
                output[i] = sq;
            }

            for (int j = i; j > 0; j--) {
                if (output[j] < output[j - 1]) {
                    int temp = output[j];
                    output[j] = output[j - 1];
                    output[j - 1] = temp;
                }
            }

        }
    }
}
