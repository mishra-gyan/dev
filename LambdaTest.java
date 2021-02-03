public class LambdaTest {

    interface LamdbaInterface1{
        int operation(int a, int b);

        default void message(String str) {
            System.out.printf("Hello");
        }
    }

    private int operate(int a, int b, LamdbaInterface1 op)
    {
        return op.operation(a, b);
    }

    public static void main(String[] args) {
        LamdbaInterface1 add = (x, y) -> x + y;

        LamdbaInterface1 multiply = (x, y) -> x * y;

        LambdaTest test = new LambdaTest();
        System.out.printf("\nOperation 1: "+ test.operate(3 ,6, add));

        System.out.printf("\nOperation 2: "+ test.operate(3 ,6, multiply));

    }
}
