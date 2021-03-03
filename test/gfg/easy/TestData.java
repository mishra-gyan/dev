package gfg.easy;

/**
 * Input Data class. Input and Output data structures have to be same.
 * @param <I> Input parameters to the test case
 * @param <V> Optional parameters to be passed
 */
public class TestData<I, O, V> {
    I input;
    O output;
    V parameter;

    TestData(I input, O output, V parameter) {
        this.input = input;
        this.output = output;
        this.parameter = parameter;
    }

}
