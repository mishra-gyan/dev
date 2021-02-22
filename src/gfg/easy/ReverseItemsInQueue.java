package gfg.easy;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Queue;

/**
 * Given an integer K and a queue of integers, we need to reverse the order of the first K elements of the queue, leaving the other elements in the same relative order.
 *
 * Only following standard operations are allowed on queue.
 *
 * enqueue(x) : Add an item x to rear of queue
 * dequeue() : Remove an item from front of queue
 * size() : Returns number of elements in queue.
 * front() : Finds front item.
 * Example 1:
 *
 * Input:
 * 5 3
 * 1 2 3 4 5
 *
 * Output:
 * 3 2 1 4 5
 *
 * Explanation:
 * After reversing the given
 * input from the 3rd position the resultant
 * output will be 3 2 1 4 5.
 *
 * Example 2:
 *
 * Input:
 * 4 4
 * 4 3 2 1
 *
 * Output:
 * 1 2 3 4
 *
 * Explanation:
 * After reversing the given
 * input from the 4th position the resultant
 * output will be 1 2 3 4.
 */
public class ReverseItemsInQueue {

    public void reverseQueue(Queue<Integer> queue, int count) {

        if ( count > queue.size() || count <= 0)
            return;
        Deque<Integer> stack = new ArrayDeque<>();

         while ( stack.size() < count ) {
                stack.push(queue.poll());
            }
        while ( ! stack.isEmpty() ) {
            queue.offer(stack.poll());
        }
        int loopCounter = queue.size() - count ;

        for (int i = 0; i < loopCounter; i++) {
            queue.offer(queue.poll());
        }
    }
}
