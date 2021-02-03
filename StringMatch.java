

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Scanner;

public class StringMatch {

    public static void main(String[] args) {

//        String[] test1 = {"1","2","3","4","5"};
//        Arrays.asList(test1).forEach(System.out::println);
//        System.exit(-1);

//        ArrayDequeue
        Scanner scanner = new Scanner(System.in);
        System.out.printf("\nEnter testcase count: ");
        int testCaseCount = Integer.parseInt(scanner.nextLine());
        int[] arrCount = new int[testCaseCount];
        final String constant = "gfg";
        for (int i = 0; i < testCaseCount; i++) {

            System.out.printf("\n Enter string: ");
            String str = scanner.nextLine();

            int index = 0;
            int count = 0;
            while ( str.indexOf(constant,index) >= 0  )
            {
                index = str.indexOf("gfg",index) + constant.length();
                count ++;
            }
            arrCount[i] = count == 0 ? --count: count;
        }
        for (int i: arrCount
             )
        {
            System.out.println(i);
        }
        scanner.close();
    }
}
