package gfg.medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class MinVerticalSum {

    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<>(Arrays.asList(1, 2, 3, 4));
        ArrayList<Integer> list2 = new ArrayList<>(Arrays.asList(5,6));
        ArrayList<Integer> list3 = new ArrayList<>(Arrays.asList(7,8,9));
        ArrayList<ArrayList<Integer>> mainList = new ArrayList<>();
        mainList.add(list1);
        mainList.add(list2);
        mainList.add(list3);
        System.out.println("min sum: " + minimum_vertical_sum(mainList));
    }

    /**
     * Loop over the integers within the ArrayList and add the vertical sum to a new ArrayList.
     * If the previous ArrayList size is smaller than current then add the remaining integer to the new ArrayList
     * @param arr ArrayList to find the minimum Vertical sum
     * @return minimum Vertical sum
     */
    public static int minimum_vertical_sum(ArrayList<ArrayList<Integer>> arr)
    {
        ArrayList<Integer> sumList = new ArrayList<>();
        for (ArrayList<Integer> list : arr) {
            int loopCount = Math.min(sumList.size(), list.size());
            for (int j = 0; j < loopCount; j++) {
                int newSum = sumList.get(j) + list.get(j);
                sumList.set(j, newSum);
            }
            if (list.size() > loopCount) // this means previous ArrayList was smaller than current ArrayList hence add the delta to the sumList
            {
                for (int j = loopCount; j < list.size(); j++) {
                    sumList.add(list.get(j));
                }
            }
        }
        return Collections.min(sumList);
    }
}
