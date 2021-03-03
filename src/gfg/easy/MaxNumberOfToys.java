package gfg.easy;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;

/**
 * You are given an array arr of size n that denotes the prices of inividual toys. You are also given an amount k that is the total money you have. You need to maximize the number of toys you can have with the k amount.
 *
 * Example 1:
 *
 * Input:
 * 5
 * 5 4 3 2 1
 * 8
 *
 * Output:
 * 3
 *
 * Explanation:
 * With k=8 amount, you can purchase toys
 * with prices 3 2 1 so total of 3 toys.
 * Example 2:
 *
 * Input:
 * 5
 * 1 2 3 4 5
 * 15
 * â€‹
 * Output:
 * 5
 *
 * Explanation:
 * With k=15 amount, you can purchase all the toys.
 * Your Task:
 * This is a function problem. You only need to complete the function max_toys that takes array, n, and k as parameters and returns the count of maximum purchasable toys with amount k.
 */
public class MaxNumberOfToys {

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1 , 2 , 3, 4, 5);
//        List<Integer> list = Arrays.asList(5 , 4 , 3, 2, 1);
        System.out.println("Array: " + list + ", max toys: " + maxToys(list, 15));

    }

    public static int maxToys(List<Integer> arr, int amount) {

        PriorityQueue<Integer> queue = new PriorityQueue<>(arr);

        int sum = 0, count = 0;
        while ( sum <= amount && !queue.isEmpty()) {
            sum += queue.poll();
            if ( sum <= amount) // this is to prevent counting amount when sum goes above amount for last element
                count++;
        }

        return count;

    }
}
