package gfg.easy;

import org.junit.jupiter.api.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.Deque;

public class TestGetMinForAStack {

    private final static ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
    private final static PrintStream originalOut = System.out;

    @BeforeAll
    public static void setUpStreams() {
        System.setOut(new PrintStream(outputStream));
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
