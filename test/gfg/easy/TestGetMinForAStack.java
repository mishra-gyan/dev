package gfg.easy;

import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.*;
import java.util.stream.Stream;

/**
 * Test case to get <code>GetMinForAStack</code>. Uses System.out console output to test for results.
 */
public class TestGetMinForAStack {

    private final static ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
    private final static PrintStream originalOut = System.out;

    public static Stream<Map.Entry<List<Integer>, String>> inputData() {
        Map<List<Integer>, String> inputData = new HashMap<>();
        inputData.put(Arrays.asList(1, 2, 3, 4, 5), "1 1 1 1 1 ");
        inputData.put(Arrays.asList(1, 6, 43, 1, 2, 0, 5), "0 0 1 1 1 1 1 ");
        inputData.put(Arrays.asList(1, 34, 23, 17,37, 42, 13, 39, 0, 53, 49, 6, 71), "0 0 0 0 0 1 1 1 1 1 1 1 1 ");
        return inputData.entrySet().stream();
    }

    @BeforeAll
    public static void setUpStreams() {
        System.setOut(new PrintStream(outputStream));
    }

    @ParameterizedTest
    @MethodSource(value = "inputData")
    void testWithMultipleInputs(Map.Entry<List<Integer>, String> inputMap) {
        GetMinForAStack s = new GetMinForAStack();
        int[] array = inputMap.getKey().stream().mapToInt(Integer::intValue).toArray();
        Deque<Integer> stack = s.push(array);
        Assertions.assertEquals(array.length, stack.size());
        Assertions.assertEquals(stack.peek(), array[array.length - 1]);

        for (int i = 0; i < array.length; i++) {
            s.getMinAtPop(stack);
        }
        Assertions.assertEquals(inputMap.getValue(), outputStream.toString());

    }

    @AfterEach
    public void clearStream() {
        outputStream.reset();
    }

    @AfterAll
    public static void reset() {
        System.setOut(originalOut);
    }

    @Test
    @Disabled
    public void test_push1() {
        int[] array = {1,2,3,4,5};
        GetMinForAStack s = new GetMinForAStack();
        Deque<Integer> stack = s.push(array);
        Assertions.assertEquals(array.length, stack.size());
        Assertions.assertEquals(stack.peek(), array[array.length - 1]);
        for (int i = 0; i < array.length; i++) {
            s.getMinAtPop(stack);
        }
        Assertions.assertEquals("1 1 1 1 1 ", outputStream.toString());

    }

    @Test
    @Disabled
    public void test_push2() {
        int[] array = {1, 6, 43, 1, 2, 0, 5};
        GetMinForAStack s = new GetMinForAStack();
        Deque<Integer> stack = s.push(array);
        Assertions.assertEquals(array.length, stack.size());
        Assertions.assertEquals(stack.peek(), array[array.length - 1]);

        for (int i = 0; i < array.length; i++) {
            s.getMinAtPop(stack);
        }
        Assertions.assertEquals("0 0 1 1 1 1 1 ", outputStream.toString());
    }

    @Test
    @Disabled
    public void test_push3() {
        int[] array = {1, 34, 23, 17,37, 42, 13, 39, 0, 53, 49, 6, 71};
        GetMinForAStack s = new GetMinForAStack();
        Deque<Integer> stack = s.push(array);
        Assertions.assertEquals(array.length, stack.size());
        Assertions.assertEquals(stack.peek(), array[array.length - 1]);

        for (int i = 0; i < array.length; i++) {
            s.getMinAtPop(stack);
        }

        Assertions.assertEquals("0 0 0 0 0 1 1 1 1 1 1 1 1 " , outputStream.toString());

    }
}
