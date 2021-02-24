package leetcode.easy;

import java.util.ArrayList;
import java.util.List;

/**
 * Given a non-empty array of integers nums, every element appears twice except for one. Find that single one.
 *
 * Follow up: Could you implement a solution with a linear runtime complexity and without using extra memory?
 *
 *
 *
 * Example 1:
 *
 * Input: nums = [2,2,1]
 * Output: 1
 * Example 2:
 *
 * Input: nums = [4,1,2,1,2]
 * Output: 4
 * Example 3:
 *
 * Input: nums = [1]
 * Output: 1
 *
 *
 * Constraints:
 *
 * 1 <= nums.length <= 3 * 104
 * -3 * 104 <= nums[i] <= 3 * 104
 * Each element in the array appears twice except for one element which appears only once.
 */
public class SingleNumber {
    public static void main(String[] args) {
        int[] nums = {2, 2, 1};
        System.out.println(singleNumberUsingList(nums));
    }

    /**
     * My solution using 2 arrays but no extra memory.
     * @param nums Input Array
     * @return single number not repeated
     */
    public static int singleNumber(int[] nums) {

        int singleNumber = 0;
        boolean matchFound;

        for (int i = 0; i < nums.length; i++) {

            matchFound = false;
            for (int j = nums.length - 1; j >= 0  ; j--) {

                if ( nums[i] == nums[j] && j != i) {
                    matchFound = true;
                    break;
                }
            }
            if ( !matchFound )
            {
                singleNumber = nums[i];
                break;
            }

        }
        return  singleNumber;
    }

    /**
     * My solution using extra memory
     * @param nums Input array
     * @return single number not repeated
     */
    public static int singleNumberUsingList(int[] nums) {

        List<Integer> list = new ArrayList<>(nums.length);
        for (int num : nums) {

            int index = list.indexOf(num);
            if (index != -1) {
                list.remove(index);
            } else {
                list.add(num);
            }
        }
        return  list.size() > 0 ? list.get(0) : 0;
    }

    /**
     * Solution from leet code using XOR operation.
     * @param nums Input array
     * @return single number not repeated
     */
    public static int singleNumberUsingXOR(int[] nums) {

        int singleNumber = 0;
        for (int n :
                nums) {

            singleNumber ^= n;
        }
        return  singleNumber;
    }


}
