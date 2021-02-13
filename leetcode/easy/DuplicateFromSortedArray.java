package leetcode.easy;

/**
 * Not my solution. Copied from Leetcode.
 */
public class DuplicateFromSortedArray {

    public static void main(String[] args) {
        //int[] arr = { 0,0,1, 1,1,2, 2,3,3};
        int[] arr = { 0, 1, 2, 3};

        int length = removeDuplicates(arr);
        System.out.println("Length: "+ length);
        for (int i = 0; i < length ; i ++ ) {
            System.out.println(arr[i]);
        }
    }

    /**
     * Swap distinct items rather than finding duplicates.
     * @param arr Array to remove duplicates
     * @return count of distinct items in the array
     */
    static int removeDuplicates(int[] arr){
        int uniqCtr = 0;
        if ( arr.length == 0 ) return 0;

        for (int i = 1; i < arr.length ; i++) {

            if (arr[i] != arr[uniqCtr]) // swap the unique items
            {
                arr[++uniqCtr] = arr[i];
            }

        }
        return uniqCtr + 1;

    }
}
