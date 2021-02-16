package gfg.easy;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.concurrent.DelayQueue;

/**
 * You are given string str. You need to remove the pair of duplicates.
 * Note: The pair should be of adjacent elements and after removing a pair the remaining string is joined together.
 *
 * Example 1:
 *
 * Input:
 * aaabbaaccd
 *
 * Output:
 * ad
 *
 * Explanation:
 * Remove (aa)abbaaccd =>abbaaccd
 * Remove a(bb)aaccd => aaaccd
 * Remove (aa)accd => accd
 * Remove a(cc)d => ad
 * Example 2:
 *
 * Input:
 * aaaa
 *
 * Output:
 * Empty String
 *
 * Explanation:
 * Remove (aa)aa => aa
 * Again removing pair of duplicates then (aa)
 * will be removed and we will get 'Empty String'.
 *
 * Your Task:
 * This is a function problem. You only need to complete the function removePair() that takes a string as a parameter and returns the modified string. Return an empty string if the whole string is deleted.
 *
 * Expected Time Complexity: O(N).
 * Expected Auxiliary Space: O(N).
 * N = length of the string.
 *
 * Constraints:
 * 1 <= |str| <= 103
 */
public class RemovePair {

    public static void main(String[] args) {
        String str = "aaabbaaccd";
        System.out.printf("Input: %s after removing pair %s", str, removePair(str));
    }

    static String removePair(String str) {
        char[] charArray = str.toCharArray();
        Deque<Character> stack = new ArrayDeque<>();
        for (char c :
                charArray) {

            if (stack.peek() != null && c == stack.peek())
                stack.pop();
            else
                stack.push(c);
        }
        StringBuilder buffer = new StringBuilder();
        while (! stack.isEmpty()) {
            buffer.append(stack.pollLast());
        }
        return buffer.toString();
    }
}
