import java.util.Arrays;

public class StreamTest {

    public static void main(String[] args) {
        int[] arr = {1,2,3,20,21,22};

        System.out.printf("\nMax of arr: " + Arrays.stream(arr).max().getAsInt());
        System.out.printf("\nAvg of arr: " + Arrays.stream(arr).average().getAsDouble());
        System.out.printf("\nMax Odd number in arr: " + Arrays.stream(arr).filter(x -> x % 2 != 0).max().getAsInt());
    }
}
