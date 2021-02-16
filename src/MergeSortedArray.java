
import java.util.Arrays;

public class MergeSortedArray {

    public static void main(String[] args) {
        int[] nums1 = {1,2,3,0,0,0,0}, nums2 = {2,5,6};

        int lengthOfFirstArray = 3, lengthOfSecondArray = nums2.length;
        int[] finalArray = new int[lengthOfFirstArray+lengthOfSecondArray];

        for (int i =  lengthOfFirstArray; i >  0  ; i--) {

            for (int j = 0; j < lengthOfSecondArray; j++) {
                if ( nums2[j] > nums1[i-1] && i == lengthOfFirstArray)
                {
                    for (int k = i; k < lengthOfFirstArray + lengthOfSecondArray; k++) {
                        nums1[k] = nums2[j];
                    }
                    System.out.print("\nArray1: "+ Arrays.toString(nums1));
                }
                /*else
                {
                    for (int k = lengthOfFirstArray; k > i  ; k--) {
                        nums1[k+1] = nums1[k];
                    }
                    nums1[i+1] = nums2[j];
                    //i +=2; j++;
                }*/
            }
            //System.out.printf("\nArray1: "+ Arrays.toString(nums1));
        }
        System.out.print("Final Array1: "+ Arrays.toString(nums1));
    }
}
