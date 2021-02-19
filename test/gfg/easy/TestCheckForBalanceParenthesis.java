package gfg.easy;

import org.junit.jupiter.api.*;

import java.util.Arrays;
import java.util.stream.Stream;

/**
 * Test case for <code>CheckForBalanceParenthesis</code>. Uses TestCaseFactory to test against multiple inputs.
 */
public class TestCheckForBalanceParenthesis {

    /**
     * The Input data is made of input to function to be tested and expected output.
     * Use map function in Stream class to pull the input and create DynamicTest object.
     * @return Stream of DynamicTest object with Assertion checking expected value against the function
     */
    @TestFactory
    public Stream<DynamicTest> testIsBalancedWithDifferentParameters() {
        String[][] input = { {"(([]))", "true"} , {"(([])", "false"}, {"" , "false"} };
        return Arrays.stream(input).map(e -> {
            String inputForTestCase = e[0];
            String expected = e[1];
            return DynamicTest.dynamicTest(inputForTestCase + " = " + expected,
                    () -> Assertions.assertEquals(Boolean.valueOf(expected), CheckForBalanceParenthesis.isBalanced(inputForTestCase)));
        });
    }


    @Test
    @Disabled
    public void testisBalanced() {
        String input = "(([]))";
        Assertions.assertTrue(CheckForBalanceParenthesis.isBalanced(input));
    }

    @Test
    @Disabled
    public void testNotBalanced() {
        String input = "(([])";

        Assertions.assertFalse(CheckForBalanceParenthesis.isBalanced(input));
    }

}
