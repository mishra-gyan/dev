
import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;
//import java.util.stream.Collectors;

public class GFG
    {
        public static void main(String[] args) {

            ArrayList<List<Integer>> arr = new ArrayList<>();
            List<Integer> list1 =  Arrays.asList(2, 3, 5);
            List<Integer> list2 =  Arrays.asList(1,2);
            List<Integer> list3 =  Arrays.asList(1, 4, 5, 1);
            arr.add(list1);
            arr.add(list2);
            arr.add(list3);
            int loopCount = 0;
            int preSum, currSum = 0;
            for (int i = 0; i < arr.size() - 1; i++) {

                List<Integer> list = arr.get(i);
                List<Integer> list5 = arr.get(i + 1);
                //looCount = list.size() > list5.size() ? list.

            }












            /*
            List<Integer> list = Arrays.asList(8, 100, 20,40, 3, 7);
            int k = 10;
            boolean t = k > 10 ? true : false;
            List<Integer> newList = new ArrayList<>();
            for (Integer i: list
                 ) {
                if ( i < 10)
                {
                    newList.add(i);
                }
            }
            newList.forEach(System.out::println);

            List<Integer> newList1 = list.stream().filter( x -> x < k).collect(java.util.stream.Collectors.toList());
            System.out.printf("\n----------\n");
            newList1.forEach(System.out::println);
            */
            //ist<Integer> list = Arrays.asList(arr);
            //ArrayList<Integer> list = new ArrayList<>();


//            for (int i = 0; i < arr.length; i++) {
//                list.add(arr[i]);
//            }

            //Collections.reverse(list);
           // list.iterator().forEachRemaining(x -> System.out.print(x + " "));

           // list.forEach(System.out::println);

        }


    }

