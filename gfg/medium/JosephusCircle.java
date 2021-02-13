package gfg.medium;

import java.util.LinkedList;

/**
 * You are given two integers n and k where n represents the total number of people who are standing in a circle, and k represents the person who gets killed in each iteration. You need to find which person is the last man standing. The indexing here starts from zero. The counting starts from the zeroth person and after each killing, the counting resets and start from the next neighbor of the killed person.
 * Example: Input:
 * 7 3
 *
 * Output:
 * 3
 *
 * Explanation:
 * There are 7 people in the circle. Let's represent
 * them as 0 1 2 3 4 5 6. Now, k is 3, so every 3rd
 * person gets killed. So first killing is 2: 0 1 2 3 4 5 6.
 * Now, the circle is 0 1 3 4 5 6. Now, we start our count
 * from the person who is represented by 3 here as this person
 * was the next in line to the killed person. So, second person
 * to be killled is 5: 0 1 3 4 5 6. The circle now looks
 * like 0 1 3 4 6. Now, we start the count from 6. The third person
 * to be killed is 1 as we are in a circle so 0 comes after the 6.
 * So killed person is 0 1 3 4 6. The circle now looks like 0 3 4 6.
 * We start the count from 3, and we kill the 3rd person from here.
 * 6 gets killed. 0 3 4 6. The circle is 0 3 4. Start the count from 0.
 * The third person gets killed, so 4 is dead. 0 3 4. The circle
 * looks 0 3. Start the count from 0 and the third person is 0
 * itself, so 3 is the last man standing.
 * Example 2: Input 8, 2 Output: 0
 */
public class JosephusCircle {

    public static void main(String[] args) {
        int n = 8, k = 2;
        System.out.println(josephus(n, k));
    }

    static int josephus ( int n, int k ) {

        LinkedList<Integer> list = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            list.add(i);
        }
        // loop over the count of k and remove the element and add to last creating a circle.
        while ( list.size() > 1 )
        {
            for (int j = 0; j < k - 1 ; j++) {
                int first = list.poll();
                list.offerLast(first);
            }
            list.pop();
        }
        return list.poll();
    }
}
