package gfg.easy;

import java.util.ArrayList;
import java.util.LinkedList;

public class ArrayListInsertion {

    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        fillArrayList(arr, arr.length);
    }


    static ArrayList<Integer> fillArrayList(int[] arr, int n)
    {
        ArrayList<Integer> list = new ArrayList<>(n);
        LinkedList<Integer> linkedList = new LinkedList<>();

        for (int i = 0; i < arr.length; i++) {
            linkedList.add(arr[i]);
        }
        linkedList.forEach(x -> System.out.print(x + " "));
        return list;
    }
}
