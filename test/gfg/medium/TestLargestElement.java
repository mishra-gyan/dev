package gfg.medium;

import gfg.easy.TestData;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DynamicTest;
import org.junit.jupiter.api.TestFactory;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class TestLargestElement {

    static TestData<List<Integer>, Integer, Integer>[] testData = new TestData[]{
      new TestData<List<Integer>, Integer, Integer>(Arrays.asList(3, 5, 4, 2, 9), 4, 3),
      new TestData<List<Integer>, Integer, Integer>(Arrays.asList(4, 3, 7, 6, 5), 3, 5)
    };

    @TestFactory
    public Stream<DynamicTest> testLargestElement() {

        return Arrays.stream(testData).map( t -> DynamicTest.dynamicTest(t.getInput()+ ", largest " + t.getParameter() + " element = " + t.getOutput(),
                () -> Assertions.assertEquals(t.getOutput(), LargestElement.KthLargest(t.getInput().stream().mapToInt(Integer::intValue).toArray(), t.getParameter())))
        );
    }
}
