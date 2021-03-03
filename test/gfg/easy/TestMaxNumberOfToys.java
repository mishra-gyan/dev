package gfg.easy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DynamicTest;
import org.junit.jupiter.api.TestFactory;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class TestMaxNumberOfToys {

    static TestData<List<Integer>, Integer, Integer>[] testData = new TestData[]{
            new TestData<>(Arrays.asList(5, 4, 3, 2, 1), 3, 8),
            new TestData<>(Arrays.asList(5, 4, 3, 2, 1), 5, 15),
            new TestData<>(Arrays.asList(1), 1, 1),
            new TestData<>(Arrays.asList(1), 1, 5)
    };

    @TestFactory
    public Stream<DynamicTest> testMaxNumberOfToys() {

        return Arrays.stream(testData).map( t -> DynamicTest.dynamicTest(t.input + ", amount: "+ t.parameter + ", expected: "+ t.output,
                () -> Assertions.assertEquals(t.output, MaxNumberOfToys.maxToys(t.input, t.parameter))));

    }
}
