package gfg.easy;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;
import java.util.Stack;

public class StockSpan {

    public static void main(String[] args) {
//        int[] arr = {30, 20, 25, 28, 27, 29};
        int[] arr ={60, 10, 20, 40, 35, 30, 50, 70, 65};
        //printArr(arr);
        //System.out.println();
        //printArr(stockSpan(arr));

        System.out.printf(Math.ceil(7/2.0) + " " + 7 %2);
    }

    private static void printArr(int[] arr) {
        for (int i :
                arr) {
            System.out.print(i + " ");
        }
    }

    static int[] stockSpan(int[] array) {
        int[] returnArr = new int[array.length];
        Deque<Integer> stack = new ArrayDeque<>(array.length);
        //Stack
        int span = 1;
        stack.push(0);

        for (int i = 1; i < array.length; i++) {

            if (stack.isEmpty())
                stack.push(array[i]);
            else
            {
                int previousInt = stack.peek();
                if ( array[i] > previousInt )
                {
                    returnArr[i] = stack.size() ;
                }
                else
                {
                    returnArr[i] = 1;
                }
            }

            stack.push(array[i]);
        }
        return returnArr;
    }

}
