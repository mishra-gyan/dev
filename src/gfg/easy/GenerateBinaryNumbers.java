package gfg.easy;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * Given a number N. The task is to generate and print all binary numbers with decimal values from 1 to N.
 *
 * Example 1:
 *
 * Input:
 * N = 2
 * Output:
 * 1 10
 * Explanation:
 * Binary numbers from
 * 1 to 2 are 1 and 10.
 *
 * Example 2:
 *
 * Input:
 * N = 5
 * Output:
 * 1 10 11 100 101
 * Explanation:
 * Binary numbers from
 * 1 to 5 are 1 , 10 , 11 , 100 and 101.
 */
public class GenerateBinaryNumbers {

    public static void main(String[] args) {

        int count = 10;
        System.out.println("Binary numbers for count: " + count + " " + generateBinary(count));
    }


    public static List<String> generateBinary(int count ){
        List<String> returnList = new ArrayList<>(count);
        Queue<String> binary = new LinkedList<>();
        binary.offer("1");
        for (int i = 0; i < count; i++) {

            String current = binary.poll();
            returnList.add(current);
            binary.offer(current + "0");
            binary.offer(current + "1");
        }
        return returnList;
    }

}
