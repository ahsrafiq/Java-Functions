import java.util.HashSet;
import java.util.Set;

public class SimpleFunctions {

    //Mutiplication
    public int multiply(int a, int b) {
        return a * b;
    }

    //Division
    public double divide(double dividend, double divisor) {
        if (divisor == 0) {
            throw new IllegalArgumentException("Cannot divide by zero");
        }
        return dividend / divisor;
    }

    //factorial
    public int factorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        return n * factorial(n - 1);
    }


    //fibonacci
    public int fibonacci(int n) {
        if (n <= 1) {
            return n;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    //Unique elements in an Array
    public int[] uniqueElements(int[] arr) {
        Set<Integer> set = new HashSet<>();
        for (int num : arr) {
            set.add(num);
        }
        int[] uniqueArr = new int[set.size()];
        int index = 0;
        for (int num : set) {
            uniqueArr[index++] = num;
        }
        return uniqueArr;
    }
}
