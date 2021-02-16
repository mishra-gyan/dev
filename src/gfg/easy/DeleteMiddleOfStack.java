package gfg.easy;

import java.util.Stack;

/**
 * Given a stack with push(), pop(), empty() operations, delete the middle of the stack without using any additional data structure.
 * Middle: ceil(size_of_stack/2.0)
 *
 *
 * Example 1:
 *
 * Input:
 * Stack = {1, 2, 3, 4, 5}
 * Output:
 * ModifiedStack = {1, 2, 4, 5}
 * Explanation:
 * As the number of elements is 5 ,
 * hence the middle element will be the 3rd
 * element which is deleted
 *
 * Example 2:
 *
 * Input:
 * Stack = {1 2 3 4}
 * Output:
 * ModifiedStack = {1 3 4}
 * Explanation:
 * As the number of elements is 4 ,
 * hence the middle element will be the 2nd
 * â€‹element which is deleted
 *
 *
 * Your Task:
 * You don't need to read input or print anything. Complete the function deleteMid() which takes the stack and its size as input parameters and modifies the stack in-place.
 * Note: The output shows the stack from top to bottom.
 *
 * Expected Time Complexity: O(N)
 * Expected Auxiliary Space: O(N)
 *
 * Constraints:
 * 2 <= size of stack <= 100
 */
public class DeleteMiddleOfStack {

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        Stack<Integer> stack = new Stack<>();
        for (int i :
                arr) {
            stack.push(i);
        }
        deleteMiddleOfStack(stack, stack.size());
        System.out.println(stack);
    }

    static void deleteMiddleOfStack(Stack<Integer> s, int sizeOfStack) {
        s.remove((sizeOfStack / 2 + sizeOfStack % 2) - 1);
    }
}
