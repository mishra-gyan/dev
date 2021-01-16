import java.util.Arrays;

/** Given a fixed length array arr of integers, duplicate each occurrence of zero, shifting the remaining elements to the right.

        Note that elements beyond the length of the original array are not written.

        Do the above modifications to the input array in place, do not return anything from your function.



        Example 1:

        Input: [1,0,2,3,0,4,5,0]
        Output: null
        Explanation: After calling your function, the input array is modified to: [1,0,0,2,3,0,0,4]
        Example 2:

        Input: [1,2,3]
        Output: null
        Explanation: After calling your function, the input array is modified to: [1,2,3]
*/
public class DuplicateZero {
    public static void main(String[] args) {
        int[] nums = {0,0,0,0,0,0,0};// {1,0,2,3,0,4,5,0};
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0 && i != (nums.length -1))
            {
                for (int j = nums.length - 1; j > i; j--) {
                    nums[j] = nums[j-1];
                }
                nums[i+1] = 0;
                i++;
            }
        }
        System.out.printf("Array: " + Arrays.toString(nums));
    }
}
