package leetcode.easy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.*;
import java.util.stream.Stream;

public class TestSingleNumber {

    public static Stream<Map.Entry<List<Integer>, Integer>> inputData() {
        Map<List<Integer>, Integer> inputData = new HashMap<>();
        inputData.put(Arrays.asList(2,2,1), 1);
        inputData.put(Arrays.asList(4,2,1,2,1), 4);
        inputData.put(Collections.singletonList(1), 1);
        inputData.put(Arrays.asList(1,1), 0);
        return inputData.entrySet().stream();
    }

    @ParameterizedTest
    @MethodSource(value = "inputData")
    public void testSingleNumber(Map.Entry<List<Integer>, Integer> inputSet) {

        int[] arr = inputSet.getKey().stream().mapToInt(Integer::intValue).toArray();
        int expectedOutput = inputSet.getValue();

        Assertions.assertEquals(expectedOutput, SingleNumber.singleNumber(arr));

        }

}
