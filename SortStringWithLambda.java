import java.util.Arrays;

public class SortStringWithLambda {

    static void sortLargeNumbers(String[] arr){

        Arrays.sort(arr, (left, right) -> {

                    if (left.length() != right.length())
                        return left.length() - right.length();

                    return left.compareTo(right);
                }
                );
    }

    public static void main(String[] args) {
        String[] arr = {"5", "5", "1234567", "56789", "10"};

        sortLargeNumbers(arr);
        for (String str: arr) {
            System.out.printf("\n " + str);
        }
    }
}
