package gfg.easy;

import org.junit.jupiter.api.*;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;
import java.util.stream.Stream;

public class TestReverseItemsInQueue {

     static TestData<Queue<Integer>, Queue<Integer>, Integer>[] inputData = new TestData[]{
            new TestData<Queue<Integer>, Queue<Integer>, Integer>(new LinkedList<>(Arrays.asList(10, 20, 30, 40, 50)), new LinkedList<>(Arrays.asList(30, 20, 10, 40, 50)), 3)
            , new TestData<Queue<Integer>, Queue<Integer>, Integer>(new LinkedList<>(Collections.singletonList(10)), new LinkedList<>(Collections.singletonList(10)), 2)
            , new TestData<Queue<Integer>, Queue<Integer>, Integer>(new LinkedList<>(Arrays.asList(10, 20, 30, 40, 50)), new LinkedList<>(Arrays.asList(50, 40,30, 20, 10)), 5)
    };


    @TestFactory
    public Stream<DynamicTest> testreverseQueue() {
        return Arrays.stream(inputData).map(input -> {

            return DynamicTest.dynamicTest(Collections.singletonList(input.input) + " reverse " + input.parameter + " counts " + " = " + Collections.singletonList(input.output),
                    () -> {
                        new ReverseItemsInQueue().reverseQueue(input.input, input.parameter);
                        Assertions.assertArrayEquals(input.input.toArray(), input.output.toArray());
                    });
        });
    }

    /**
     * Simple JUnit to test with one input data
     */
    @Test
    @DisplayName("Reverse part of array")
    public void testreversequeue(){

        ReverseItemsInQueue queue = new ReverseItemsInQueue();
        Queue<Integer> q = new LinkedList<>(Arrays.asList(10,20,30,40,50));
        queue.reverseQueue(q, 3);
        Assertions.assertArrayEquals(Arrays.asList(30,20,10,40,50).toArray(), q.toArray());
    }

}

