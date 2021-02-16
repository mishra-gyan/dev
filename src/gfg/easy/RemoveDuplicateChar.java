package gfg.easy;

import java.util.ArrayDeque;

/**
 * You are given string str. You need to remove the consecutive duplicates from the given string using a Stack.
 *
 *
 * Example 1:
 *
 * Input:
 * aaaaaabaabccccccc
 *
 * Output:
 * ababc
 *
 * Explanation:
 * Removing all consecutive duplicates,
 * we have no duplicates consecutively.
 * Example 2:
 *
 * Input:
 * abbccbcd
 *
 * Output:
 * abcbcd
 *
 * Explanation:
 * Removing all the consecutive duplicates,
 * we have the output as abcbcd.
 *
 * Your Task:
 * This is a function problem. You need to complete the function removeConsecutiveDuplicates() that takes a string as a parameter and returns the modified string. The printing is done automatically by the driver code.
 *
 * Expected Time Complexity: O(N).
 * Expected Auxiliary Space: O(N).
 *
 * Constraints:
 * 1 <= |str| <= 103
 */
public class RemoveDuplicateChar {

    public static void main(String[] args) {
        String str = "aaaaaabaaabccccccc";

        System.out.println(removeDuplicates(str));
    }

    static String removeDuplicates(String str) {
        char[] charArray = str.toCharArray();
        ArrayDeque<Character> stack = new ArrayDeque<>();
        for (char c :
                charArray) {
            if ( stack.isEmpty()  || c != stack.peek() )
                stack.push(c);
        }
        StringBuilder returnStr = new StringBuilder();
        while (! stack.isEmpty())
        {
            returnStr.append(stack.pollLast());
        }
        return returnStr.toString();
    }
}
