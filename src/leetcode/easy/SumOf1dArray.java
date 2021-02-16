package leetcode.easy;


/**
 * Given an array nums. We define a running sum of an array as runningSum[i] = sum(nums[0]…nums[i]).
 *
 * Return the running sum of nums.
 *
 *
 *
 * Example 1:
 *
 * Input: nums = [1,2,3,4]
 * Output: [1,3,6,10]
 * Explanation: Running sum is obtained as follows: [1, 1+2, 1+2+3, 1+2+3+4].
 * Example 2:
 *
 * Input: nums = [1,1,1,1,1]
 * Output: [1,2,3,4,5]
 * Explanation: Running sum is obtained as follows: [1, 1+1, 1+1+1, 1+1+1+1, 1+1+1+1+1].
 * Example 3:
 *
 * Input: nums = [3,1,2,10,1]
 * Output: [3,4,6,16,17]
 *
 *
 * Constraints:
 *
 * 1 <= nums.length <= 1000
 * -10^6 <= nums[i] <= 10^6
 */
public class SumOf1dArray {
    public static void main(String[] args) {
        //int[] arr = {1,2,3,4};
        int[] arr = {1,1,1,1,1,1};
        int[] retArr = new SumOf1dArray().runningSum(arr);
        for (int i :
                retArr) {
            System.out.print("\n" + i);
        }
    }

    public int[] runningSum(int[] arr) {

        int[] returnArr = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {

            returnArr[i] = i == 0 ?  arr[i] : returnArr[i - 1] + arr[i];
        }
        return returnArr;
    }
}
