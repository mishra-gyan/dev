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

    public TestData(I input, O output, V parameter) {
        this.input = input;
        this.output = output;
        this.parameter = parameter;
    }

    public I getInput() {
        return input;
    }

    public void setInput(I input) {
        this.input = input;
    }

    public O getOutput() {
        return output;
    }

    public void setOutput(O output) {
        this.output = output;
    }

    public V getParameter() {
        return parameter;
    }

    public void setParameter(V parameter) {
        this.parameter = parameter;
    }
}
