package fibonacci;

public class Fibonacci {

    static long fibonacciRecursivo(int n) {
        if (n == 0) return 0;
        if (n == 1) return 1;
        return fibonacciRecursivo(n - 1) + fibonacciRecursivo(n - 2);
    }

    static long fibonacciIterativo(int n) {
        long i = 0;
        long j = 1;

        for (int k = 1; k < n; k++) {
            long t;
            t = i + j;
            i = j;
            j = t;
        }
        return j;
    }
}