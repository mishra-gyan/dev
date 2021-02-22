package gfg.easy;

import org.junit.jupiter.api.*;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;
import java.util.stream.Stream;

public class TestReverseItemsInQueue {

     static TestData[] inputData = new TestData[]{
            new TestData<Queue<Integer>, Integer>(new LinkedList<>(Arrays.asList(10, 20, 30, 40, 50)), new LinkedList<>(Arrays.asList(30, 20, 10, 40, 50)), 3)
            , new TestData<Queue<Integer>, Integer>(new LinkedList<>(Collections.singletonList(10)), new LinkedList<>(Collections.singletonList(10)), 2)
            , new TestData<Queue<Integer>, Integer>(new LinkedList<>(Arrays.asList(10, 20, 30, 40, 50)), new LinkedList<>(Arrays.asList(50, 40,30, 20, 10)), 5)
    };


    @TestFactory
    public Stream<DynamicTest> testreverseQueue() {
        return Arrays.stream(inputData).map(input -> {
            TestData<Queue<Integer>, Integer> testCaseData = input;

            return DynamicTest.dynamicTest(Collections.singletonList(testCaseData.input) + " reverse " + testCaseData.parameter + " counts " + " = " + Collections.singletonList(testCaseData.output),
                    () -> {
                        new ReverseItemsInQueue().reverseQueue(testCaseData.input, testCaseData.parameter);
                        Assertions.assertArrayEquals(testCaseData.input.toArray(), testCaseData.output.toArray());
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

class TestData<E, V> {
    E input;
    E output;
    V parameter;

    TestData(E input, E output, V parameter) {
        this.input = input;
        this.output = output;
        this.parameter = parameter;
    }

}