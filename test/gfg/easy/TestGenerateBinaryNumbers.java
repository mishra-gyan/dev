package gfg.easy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DynamicTest;
import org.junit.jupiter.api.TestFactory;

import java.util.Arrays;
import java.util.stream.Stream;

public class TestGenerateBinaryNumbers {

    @TestFactory
    public Stream<DynamicTest> testgenerateBinary() {
        String[][] inputData = {{"5", "[1, 10, 11, 100, 101]" },
                                {"10", "[1, 10, 11, 100, 101, 110, 111, 1000, 1001, 1010]"},
                                {"0", "[]"}
                                };
        return Arrays.stream(inputData).map( data -> {
            int count = Integer.parseInt(data[0]);
            String expectedOutput = data[1];
            return DynamicTest.dynamicTest("Binary number for "+ count + " = " + expectedOutput,
                    () -> Assertions.assertEquals(expectedOutput, GenerateBinaryNumbers.generateBinary(count).toString()));
        } );

    }
}
