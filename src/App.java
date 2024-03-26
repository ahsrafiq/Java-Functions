import java.util.Arrays;

public class App {
    public static void main(String[] args) throws Exception {
        
        //Multiplication
        SimpleFunctions s = new SimpleFunctions();
        int result = s.multiply(5, 10);
        System.out.println("Multiplication Result: " + result);

        //Division
        double res = s.divide(20.0, 5.0);
        System.out.println("Division Result: " + res);

        //Factorial
        int fact = s.factorial(5);
        System.out.println("Factorial Result: " + fact);

        //Fibonacci
        int fib = s.fibonacci(6);
        System.out.println("Fibonacci Result: " + fib);

        //Unique Elements
        int[] arr = {1, 2, 3, 4, 4, 5, 6, 6};
        int[] uniqueArr = s.uniqueElements(arr);
        System.out.println("Unique Elements in Array: " + Arrays.toString(uniqueArr));
    }
}
