package gfg.medium;

import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * Given an array arr[] of N positive integers and a number K. The task is to find the kth largest element in the array.
 *
 * Example 1:
 *
 * Input:
 * N = 5, K = 3
 * arr[] = {3, 5, 4, 2, 9}
 * Output:
 * 4
 * Explanation:
 * Third largest element
 * in the array is 4.
 * Example 2:
 *
 * Input:
 * N = 5, K = 5
 * arr[] = {4, 3, 7, 6, 5}
 * Output:
 * 3
 * Explanation:
 * Fifth largest element
 * in the array is 3.
 * Your Task:
 * You are required to complete the method KthLargest() which takes 3 arguments and returns the Kth Largest element.
 */

public class LargestElement {

    public static void main(String[] args) {
        int[] arr = { 4, 3, 7, 6, 5};
        System.out.println(KthLargest(arr, 5));
    }


    public static int KthLargest(int[] arr, int k) {
        PriorityQueue<Integer> queue= new PriorityQueue<>(Comparator.reverseOrder());
        for (int i :
                arr) {
            queue.add(i);
        }
        for (int i = 0; i < k-1; i++) {
            queue.poll();
        }
        return queue.peek();
    }
}
